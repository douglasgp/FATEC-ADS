function browserType() {
  this.name = navigator.appName;
  this.version = navigator.appVersion; //Versão
  this.dom = document.getElementById ? 1 : 0 //w3-dom
  this.op5 = (this.name.indexOf("Opera") > -1 && (this.dom)) ? 1 : 0 //Opera Browser
  this.ie4 = (document.all && !this.dom) ? 1 : 0 //ie4
  this.ie5 = (this.dom && this.version.indexOf("MSIE ") > -1) ? 1 : 0 //IE5, IE6?
  this.ns4 = (document.layers && !this.dom) ? 1 : 0 //NS4
  this.ns5 = (this.dom && this.version.indexOf("MSIE ") == -1) ? 1 : 0 //NS6, Mozilla5

  if (this.ie4 || this.ie5) {
    document
        .write('<DIV id=testOpera style="position:absolute; visibility:hidden">TestIfOpera5</DIV>');
    if (document.all['testOpera'].style.clip == 'rect()') {
      this.ie4 = 0;
      this.ie5 = 0;
      this.op5 = 1;
    }
  }
  this.ok = (this.ie4 || this.ie5 || this.ns4 || this.ns5 || this.op5)
  eval("bt=this");
}
browserType();
function getObj(obj) {
  function getRefNS4(doc, obj) {
    var fobj = 0;
    var c = 0
    while (c < doc.layers.length) {
      if (doc.layers[c].name == obj)
        return doc.layers[c];
      fobj = getRefNS4(doc.layers[c].document, obj)
      if (fobj != 0)
        return fobj
      c++;
    }
    return 0;
  }
  return (bt.dom) ? document.getElementById(obj)
      : (bt.ie4) ? document.all[obj] : (bt.ns4) ? getRefNS4(document,
          obj) : 0
}
function createPageSize() {
  this.width = (bt.ns4 || bt.ns5 || bt.op5) ? innerWidth
      : document.body.offsetWidth;
  this.height = (bt.ns4 || bt.ns5 || bt.op5) ? innerHeight
      : document.body.offsetHeight;
  return this;
}
var screenSize = new createPageSize();
function createLayerObject(name) {
  this.name = name;
  this.obj = getObj(name);
  this.css = (bt.ns4) ? obj : obj.style;
  this.x = parseInt(this.css.left);
  this.y = parseInt(this.css.top);
  this.show = b_show;
  this.hide = b_hide;
  this.moveTo = b_moveTo;
  this.moveBy = b_moveBy;
  this.writeText = b_writeText;
  return this;
}
function b_show() {
  this.css.visibility = 'visible';
}
function b_hide() {
  this.css.visibility = 'hidden';
}
function b_moveTo(x, y) {
  this.x = x;
  this.y = y;
  this.css.left = x;
  this.css.top = y;
}
function b_moveBy(x, y) {
  this.moveTo(this.x + x, this.y + y)
}
function b_writeText(text) {
  if (bt.ns4) {
    this.obj.document.write(text);
    this.obj.document.close();
  } else {
    this.obj.innerHTML = text;
  }
}

function b_effektInfo() {
  if (this.visible) {
    this.show();
    if (this.actColor < this.colors.length) {
      if (bt.ns4)
        this.writeText(this.text, this.cl,
            this.colors[this.actColor]);
      else
        this.css.color = this.colors[this.actColor];
      this.actColor++;
    }
  } else {
    if (this.actColor > 0) {
      this.actColor--;
      if (bt.ns4)
        this.writeText(this.text, this.cl,
            this.colors[this.actColor]);
      else
        this.css.color = this.colors[this.actColor];
      if (this.actColor == 0) {
        this.hide();
      }
    }
  }
}
function b_writeText(text, cl, color) {
  var t
  t = '<span class="'+cl+'"><FONT color="'+color+'">' + text
      + '</FONT></span>';
  if (bt.ns4) {
    this.obj.document.write(t);
    this.obj.document.close();
  }
}
function createInfo(name, x, y, text, cl) {
  if (bt.ns4)
    document
        .write("<LAYER class='"+cl+"' visibility='hide' name='"+name+"'>"
            + text + "</LAYER>");
  else
    document
        .write("<DIV class='"+cl+"' id='"+name+"' style='visibility:hidden;'>"
            + text + "</DIV>");
  this.colors = new Array('#ffffff', '#EEEEEE', '#CCCCCC', '#AAAAAA',
      '#999999', '#333333', '#000000')
  this.visible = false;
  this.text = text;
  this.cl = cl;
  this.actColor = 0;
  this.name = name;
  this.obj = getObj(name);
  this.css = (bt.ns4) ? this.obj : this.obj.style;
  this.visbility = 'visible'
  this.hide = b_hide;
  this.show = b_show;
  this.moveTo = b_moveTo;
  this.moveBy = b_moveBy;
  this.writeText = b_writeText;
  this.effekt = b_effektInfo;
  this.x = 0;
  this.y = 0;
  this.moveTo(x, y);
  this.hide();
  return this;
}
function b_addInfo(nr, text, cl, x, y) {
  this.infos[nr] = new createInfo(this.name + nr, x, y, text, cl);
}
function b_showInfo(nr, vis) {
  if (this.infos[nr])
    this.infos[nr].visible = vis;
}
function b_infoArrayEffekt() {
  var i;
  if (this.rotate > 0 && !this.inRotate) {
    this.inRotate = true;
    this.effektRotate();
  }
  for (i = 0; i < this.infos.length; i++) {
    if (this.infos[i])
      this.infos[i].effekt();
  }
  setTimeout(this.v + '.effekt()', 150);
}
function b_infoRefresh() {
  var i;
  for (i = 0; i < this.infos.length; i++) {
    if (this.infos[i]) {
      this.infos[i].moveTo(this.infos[i].x, this.infos[i].y);
      this.infos[i].css.visibility = this.infos[i].visibility;
    }
  }
}
function b_infoRotate() {
  if (this.infos[this.actInfo])
    this.showInfo(this.actInfo, false);
  this.actInfo++;
  while (!this.infos[this.actInfo]) {
    if (this.actInfo > this.infos.length)
      this.actInfo = 0;
    else
      this.actInfo++;
  }
  this.showInfo(this.actInfo, true);
  if (this.rotate > 0)
    setTimeout(this.v + '.effektRotate()', this.rotate);
  else
    this.inRotate = false;
}
function b_resize(e) {
  if (bt.op5) {
    var s = new createPageSize();
    if ((screenSize.width != s.width)
        || (screenSize.height != s.height)) {
      screenSize = new createPageSize();
      this.refresh();
      eval(e);
    }
    setTimeout(this.v + ".resize('" + e + "')", 500);
  }
}
function createInfoArray(name) {
  this.infos = new Array();
  this.name = name;
  this.addInfo = b_addInfo;
  this.showInfo = b_showInfo;
  this.effekt = b_infoArrayEffekt;
  this.effektRotate = b_infoRotate;
  this.refresh = b_infoRefresh;
  this.rotate = 0;
  this.inRotate = false;
  this.actInfo = 0
  this.resize = b_resize;
  this.v = name + "var";
  eval(this.v + "=this");
  this.effekt();
  return this
}

//name     : ID do menu
//centerx  : x-position do centro do círculo
//centery  : y-position do centro do círculo
//radius   : raio do botão do centro
//radi     : raio do 'info' do círculo (opcional)
function createCircleMenu(name, centerx, centery, radius, radi) {
  this.name = name
  this.angle = 0;
  this.cx = centerx;
  this.cy = centery;
  this.rad = radius;
  this.radi = radius + 10;
  if (radi)
    this.radi = radi;
  this.currentangle = 0;
  this.currentButton = 0;
  this.lastx = 0
  this.lasty = 0
  this.buttons = new Array();
  this.effekt = b_menuEffekt;
  this.show = false
  this.action = b_menuAction;
  this.initEffekt = b_initEffekt;
  this.addButton = b_addButton;
  this.v = name + "var";
  eval(this.v + "=this");
  this.info = new createInfoArray(name + '_info');
  return this
}
function b_addButton(pict, action, over, out, info) {
  this.buttons[this.buttons.length] = new b_createButton(this, pict,
      action, over, out, info);
}
function b_createButton(parent, pict, action, over, out, info) {
  var b
  var n
  n = parent.name + parent.buttons.length;
  l = parent.buttons.length;
  j = "if (bt.ie4 || bt.ie5) this.blur(); " + parent.v + ".action(" + l
      + "); return false;";
  b = '<a href="#" onClick="'+j+'" onMouseOver="'+over
  b = b +'" onMouseOut="'+out+'"><IMG src="'+pict+'" id='+n+'img border=0></A>';
  if (bt.ns4)
    document.write("<LAYER name="+n+" visibility='hide'>" + b
        + "</LAYER>");
  else
    document.write("<DIV id="+n+" style='visibility=hidden'>" + b
        + "</DIV>");
  this.action = action
  this.parent = parent;
  this.obj = getObj(n);
  if (bt.ns4)
    this.img = this.obj.document.images[0];
  else
    this.img = getObj(n + 'img');
  this.css = (bt.ns4) ? this.obj : this.obj.style;
  this.css.visibility = 'hidden';
  this.stop = 0;
  this.x = 0;
  this.y = 0;
  this.setAngle = b_setAngle;
  this.setInfo = b_setInfo;
  this.moveTo = b_moveTo;
  parent.info.addInfo(l, info, 'binfo', 20 * l, 10);
  this.ind = l;
  return this;
}
function b_menuAction(button) {
  this.show = !this.show
  if (this.buttons[this.currentButton].x != this.lastx)
    this.buttons[this.currentButton].moveTo(this.lastx, this.lasty);
  this.initEffekt(button);
}
function b_setInfo(angle) {
  var x1
  var y1
  var width
  if (ns4) {
    width = this.parent.info.infos[this.ind].obj.document.width;
  } else {
    if (this.parent.info.infos[this.ind].obj.style.pixelWidth)
      width = this.parent.info.infos[this.ind].obj.style.pixelWidth;
    else
      width = this.parent.info.infos[this.ind].obj.offsetWidth;
  }
  x1 = this.parent.cx - (this.parent.radi)
      * Math.cos(angle * Math.PI / 180);
  if ((angle % 360) >= 270 || (angle % 360) < 90)
    x1 = x1 - width
  x1 = x1 + (this.parent.radi - this.parent.rad) / 2;
  y1 = this.parent.cy - (this.parent.radi + 5)
      * Math.sin(angle * Math.PI / 180);
  y1 = y1 - (this.parent.radi - this.parent.rad) / 4;
  this.parent.info.infos[this.ind].moveTo(x1, y1);
}
function b_setAngle(angle) {
  this.x = this.parent.cx - this.parent.rad
      * Math.cos(angle * Math.PI / 180);
  this.y = this.parent.cy - this.parent.rad
      * Math.sin(angle * Math.PI / 180);
  this.moveTo(this.x, this.y);
  this.parent.lastx = this.x
  this.parent.lasty = this.y
}
function b_initEffekt(button) {
  step = 360 / this.buttons.length;
  this.angle = 90 + step * button
  stop = 90 + step * (button + 1)
  this.currentButton = button
  for (i = button + 1; i < this.buttons.length; i++) {
    this.buttons[i].stop = stop
    this.buttons[i].setAngle(stop);
    this.buttons[i].setInfo(stop);
    if (this.show) {
      this.buttons[i].css.visibility = 'hidden';
    } else
      this.buttons[i].css.visibility = 'visible';
    this.buttons[i].zIndex = 0;
    stop = stop + step;
  }
  for (i = 0; i <= button; i++) {
    this.buttons[i].stop = stop
    this.buttons[i].setAngle(stop);
    this.buttons[i].setInfo(stop);
    if (this.show)
      this.buttons[i].css.visibility = 'hidden';
    else
      this.buttons[i].css.visibility = 'visible';
    this.buttons[i].zIndex = 90;
    stop = stop + step;
  }
  this.buttons[button].css.visibility = 'visible';
  this.buttons[button].css.zIndex = 99;
  this.effekt();
}
function b_menuEffekt() {
  this.angle = this.angle + 5;
  this.buttons[this.currentButton].setAngle(this.angle);
  for (i = 0; i < this.buttons.length; i++) {
    if (this.angle >= this.buttons[i].stop) {
      if (!this.show) {
        if (i != this.currentButton) {
          this.buttons[i].css.visibility = 'hidden';
          this.info.showInfo(this.buttons[i].ind, false);
        }
      } else {
        this.buttons[i].css.visibility = 'visible';
        this.info.showInfo(this.buttons[i].ind, true);
      }
    }
  }
  if (this.angle < this.buttons[this.currentButton].stop)
    setTimeout(this.v + '.effekt()', 30)
  else if (!this.show)
    eval(this.buttons[this.currentButton].action);
}

function ishow() {
  if (bt.ns4)
    document.layers['binfo'].visibility = 'hide';
  menu.action(0);
}

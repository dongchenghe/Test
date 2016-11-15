$(function(){
	var msgarea=$("#msgarea");
	var msg1span=$("#msg1span");
	var msg2span=$("#msg2span");
	var msg3span=$("#msg3span");
	var msg4span=$("#msg4span");
	var msg5span=$("#msg5span");
	var premsgarea=$("#premsgarea");
	var onediv=$("#onediv");
	var twodiv=$("#twodiv");
	var threediv=$("#threediv");
	var fourdiv=$("#fourdiv");
	var fivediv=$("#fivediv");
	var sixdiv=$("#sixdiv");
	var sevendiv=$("#sevendiv");
	var eightdiv=$("#eightdiv");
	var ninediv=$("#ninediv");
	var tendiv=$("#tendiv");
	
	onediv.click(function(){	
		msgarea.val(onediv.text());	
	});
	twodiv.click(function(){
		msgarea.val(twodiv.text());	
	});
	threediv.click(function(){
		msgarea.val(threediv.text());	
	});
	fourdiv.click(function(){
		msgarea.val(fourdiv.text());	
	});
	fivediv.click(function(){
		msgarea.val(fivediv.text());	
	});
	sixdiv.click(function(){
		msgarea.val(sixdiv.text());	
	});
	sevendiv.click(function(){
		msgarea.val(sevendiv.text());	
	});
	eightdiv.click(function(){
		msgarea.val(eightdiv.text());	
	});
	ninediv.click(function(){
		msgarea.val(ninediv.text());	
	});
	tendiv.click(function(){
		msgarea.val(tendiv.text());	
	});
	msg1span.click(function(){
		msg1span.css("background-color","#f56600");
		msg2span.css("background-color","#c0c0c0");
		msg3span.css("background-color","#c0c0c0");
		msg4span.css("background-color","#c0c0c0");
		msg5span.css("background-color","#c0c0c0");
		
		onediv.text("有一种缘分让人珍惜，有一种感激常留心底，有一种惦念天长地久，有一种心声期待见您，所有的默契无须传递，所有的话语盛满祝福：亲爱的老师，祝您教师节快乐，永远健康幸福快乐！");
		
		twodiv.text("并不是只在今天才想起您，而是今天特别想念您。感谢您给予我的每一个指导、每一个支持和每一个笑容，谢谢您。因为没能做到经常与您联系或见面，但心中充满对您的感谢和想念。");
		
		threediv.text("忘不了您和风细雨般的话语，荡涤了我心灵上的尘泥；忘不了您浩荡东风般的叮咛，鼓起我前进的勇气。老师，我终生感激您！老师恩情，永生难忘。祝恩师节日快乐，桃李满门。");
		
		fourdiv.text("引一缕清风，为老师带去轻松；采一缕阳光，为老师送去温暖；掬一捧清水，为老师消去疲惫；送一束鲜花，为老师奉上祝福。祝老师节日快乐！");
		
		fivediv.text("漫漫岁月,您的声音，总在我耳畔响起；您的身影，常在我脑中浮现；您的教诲，常驻在我心田……在今天这属于您的日子里，恭祝您平安如愿，桃李满天下！");
		
		sixdiv.text("老师是山，高大挺拔；老师是松，苍翠欲滴；老师是鹰，带我腾飞；老师是伞，为我遮风挡雨。值此教师节来临之际，祝我的老师节日愉快，身体健康！");
		
		sevendiv.text("不限于这特别的日子，想念时刻依然；尤在这特别的日子，希望您倍感欣慰！感谢您给孩子带来的美好童年，就像一米阳光，近距离照耀，无限温暖!祝您节日快乐，身体健康，靓丽如鲜花，快乐如孩子...");
		
		eightdiv.text("因为您的一片爱心的灌浇，一番耕耘的辛劳，才会有桃李的绚丽，稻麦的金黄。愿我们的谢意化成一束不凋的鲜花，给您的生活带来芬芳。");
		
		ninediv.text("老师，一个个日子升起又降落，一届届学生走来又走过，不变的是您深沉的爱和灿烂的笑容。恩师，经历了风雨，才知道您的可贵；走上了成功，才知道您的伟大！美好的记忆留在青春的校园，感谢您的关怀，感谢您的帮助，感谢您为我所做的一切。请接受学生美好的祝愿，祝您教师节快乐，天天快乐！");
		
		tendiv.text("九月，秋风飒飒，秋叶飘飘，这是秋的季，是收获的季节，是回报的季节，老师，祝您节日快乐，身体健康，工作顺心如意！");
		
	});
	msg2span.click(function(){
		msg1span.css("background-color","#c0c0c0");
		msg2span.css("background-color","#f56600");
		msg3span.css("background-color","#c0c0c0");
		msg4span.css("background-color","#c0c0c0");
		msg5span.css("background-color","#c0c0c0");
		onediv.text("月缺时我念你，月圆时我想你，无论月圆月缺，我心如月光默默的追随着你的每一微笑，中秋快乐。");
		
		twodiv.text("月明星稀终守候，千里思念遥相寄。绵绵爱意于此诉，浓浓情意化祝福：中秋快乐");
		
		threediv.text("又是一年月圆时，鲜花一束敬慈母，千言万语道不尽，祝福安康笑开颜！祝妈妈中秋快乐！ ");
		
		fourdiv.text("时逢佳节，无论相隔多远，那只是空间上的距离，牵挂亲人的一颗心永不变。让鲜花、月饼送去给你们的祝福：爸妈，中秋节快乐！");
		
		fivediv.text("一生一世执子手，不离不弃共白头。风雨齐闯，苦乐同享，即使两鬓都苍苍，共你十指紧扣看斜阳。爱你永不变。");
		
		sixdiv.text("天上月圆，人间团圆，家庭情圆，心中事圆，花好月圆，左右逢圆。愿你在每一天中，人缘、情缘、福缘、财缘，缘缘不断，事事如愿！祝你中秋快乐梦想成真万事如意！");
		
		sevendiv.text("岁月改变了爸妈的容颜，却也使我更加懂得珍惜你们那无尽的爱。中秋月，夜团圆，幸福无边！人康健，事如意，吉祥伴，人生美好无限！");
		
		eightdiv.text("月是故乡的圆，情是家乡的缘，坐视庭院明月光，挥酒畅聊赏月亮。家是幸福的园，庭是团聚得点，全家围桌其乐玩，品味佳肴齐乐唱。祝亲爱的爸妈中秋节快乐！");
		
		ninediv.text("");
		
		tendiv.text("");
		
	});
	msg3span.click(function(){
		msg1span.css("background-color","#c0c0c0");
		msg2span.css("background-color","#c0c0c0");
		msg3span.css("background-color","#f56600");
		msg4span.css("background-color","#c0c0c0");
		msg5span.css("background-color","#c0c0c0");
		onediv.text("爱你是我一生无悔的决定，漫天星星都是我注视你的眼睛。无论结局如何，我都知道：此生最爱是你！情人节快乐！");
		
		twodiv.text("当阳光还没爬上布满蔓藤的篱笆，迫不及待的红玫瑰早已缀满了你的窗台。情人节快乐！Will you be my valentine?");
		
		threediv.text("我的情人节里没有情人，只有老婆你，你是我的最爱，今天是，明天是，直到我死去我的心中也只有你!情人节快乐，老婆!");
		
		fourdiv.text("遇到你我感到很幸福，但是我不能成为世界上最幸福的人，因为我们在一起，我要让你成为世界上最幸福的人。");
		
		fivediv.text("我从灵魂深处爱你，我愿把生命交给你，由你接受多少就多少，现在是这样，以后也决不变更！");
		
		sixdiv.text("我多么希望，有一个门口，早晨，阳光照在草上，我们站着，扶着自己的门扇，门很低，但太阳是明亮的。草在结它的种子，风在摇它的叶子，我们站着，不说话，就十分美好。");
		
		sevendiv.text("不要因为也许会改变，就不肯说那句美丽的誓言；不要因为也许会分离，就不敢求一次倾心的相遇。");
		
		eightdiv.text("时间会慢慢地让你了解，一个外表很冷漠又很怕羞的人，他的心却充满了对你的爱。");
		
		ninediv.text("我的心是旷野的鸟，在你的眼睛里找到了天空。");
		
		tendiv.text("女王大人！原谅我吧！我知道我错了，你若不能原谅我的话，那就不断的打电话骂我吧！我愿意被你骂到老！");
		
	});
	msg4span.click(function(){
		msg1span.css("background-color","#c0c0c0");
		msg2span.css("background-color","#c0c0c0");
		msg3span.css("background-color","#c0c0c0");
		msg4span.css("background-color","#f56600");
		msg5span.css("background-color","#c0c0c0");
		onediv.text("一切的不顺心都是纸老虎！希望你开心！");
		
		twodiv.text("这些日子你过得还好吗？也许忙碌改变了我们的生活，但我永远珍惜我们的情谊。");
		
		threediv.text("有些情感，无需多么华美，只是简单的遇见，简单的想念，哪怕它只是简单到：拉着你的手，迎着风走！");
		
		fourdiv.text("不求同年同月同日生，但求同年同月同日疯");
		
		fivediv.text("所有人都说我很坚强，只有你劝我别逞强");
		
		sixdiv.text("无私无邪无猜无疑的友情无价，你是我买不到的奢华");
		
		sevendiv.text("不管世界尽头多寂寞，你的身边一定有我");
		
		eightdiv.text("朋友是一颗心住在两个人的心房里");
		
		ninediv.text("替你那个他娘的还没出现的另一半送束花给你，好好混，以后相互抱大腿。");
		
		tendiv.text("生日快乐么么哒，恭祝兄弟仙福永享寿与天齐。");
		
	});
	msg5span.click(function(){
		msg1span.css("background-color","#c0c0c0");
		msg2span.css("background-color","#c0c0c0");
		msg3span.css("background-color","#c0c0c0");
		msg4span.css("background-color","#c0c0c0");
		msg5span.css("background-color","#f56600");
		onediv.text("亲爱的妈妈，我也想嫁出去，只是没遇到对的人。但我保证会过得很好，你别担心。你和爸爸身体健康才是我最幸福的事情。多出去走走，看看这个世界。");
		
		twodiv.text("亲爱的妈妈：您曾用您坚实的臂弯为我撑起一片蓝天；而今，我也要用我日益丰满的羽翼为您遮挡风雨。妈妈，我永远爱您！生日快乐！祝我的美女妈妈越来越青春，身体健康，瘦成闪电，未来的我可以每个假期带你出去纵横~");
		
		threediv.text("老爸你知道吗：每天都会有人赞叹我的聪明、优雅和帅气！而我总是骄傲地说：俺爹出品，必属精品! 老爸：父亲节快乐!");
		
		fourdiv.html("妈妈，我是您身边的一只备受关怀的小鸟，今天为您衔来了一束芬芳的鲜花。");
		
		fivediv.text("引一缕清风，为妈妈带去轻松；采一缕阳光，为妈妈送去芬芳；掬一捧清水，为妈妈消去疲惫；送一束鲜花，为妈妈奉上祝福。祝妈妈生日快乐！");
		
		sixdiv.text("不想时间过得那么快，因为我想有再多一点时间回家陪着你。不要觉得自己老了，在别人眼里，你还只是我姐呢。生日快乐，妈，我爱你！");
		
		sevendiv.text("美丽动人可爱迷人的妈妈：生日快乐！青春永驻！虽然不能陪伴在你身边，我的心一直陪伴着你，我爱你，妈妈。");
		
		eightdiv.text("“洗衣做饭忙不完，每日忙碌不着闲，历经风霜添白发，勤劳持家不知烦”。作为儿子女儿的我们，深知您每天的辛苦忙碌，但作为儿子女儿的我们，同样要给您幸福，祝您生日快乐，幸福万年长。");
		
		ninediv.text("父爱如山，父爱无言，您总是微笑着担起了整个家庭。在我心中，您是全天下最好的爸爸。");
		
		tendiv.text("忘不了您和风细雨般的话语，荡涤了我心灵上的尘泥；忘不了您浩荡东风般的叮咛，鼓起我前进的勇气。老师，我终生感激您！");
		
	});
	
	var payonline=$("#payonline");
	var paybycard=$("#paybycard");
	payonline.click(function(){
		payonline.css("background-color","#f56600");
		paybycard.css("background-color","#c0c0c0");
	});
	paybycard.click(function(){
		payonline.css("background-color","#c0c0c0");
		paybycard.css("background-color","#f56600");
		
	});
	
	var submitbtn=document.getElementById("submitbtn");
	
	submitbtn.onclick=function (){
		var subform=document.getElementById("subform");
		
		subform.submit();
	};
	
	
	
	var yearselect=$("#yearselect");	
	var monthselect=$("#monthselect");
	var dayselect=$("#dayselect");
	var hourselect=$("#hourselect");
	var yearsBetn=yearsBetween();
	for(var i=0;i<yearsBetn;++i){
		var option=$("<option/>");
		option.html(current_year+i);
		option.attr("value",current_year+i);
		yearselect.append(option);
	}
	

	yearselect.blur(function(){
		monthselect[0].options.length=0;
		var months=monthsDiffToyearEnd(current_year,current_month,current_day,pre_days);
		if(yearselect.val()==current_year){
			for(var i=0;i<months;++i){
			var option=$("<option/>");
			option.html(current_month+i);
			option.attr("value",current_month+i);
			monthselect.append(option);
			}
		}else{
			var restMonth=RestMonthsNextYear(current_year,current_month,current_day,pre_days);
			for(var i=1;i<=restMonth;++i){
			var option=$("<option/>");
			option.html(i);
			option.attr("value",i);
			monthselect.append(option);
			}
		}
	});
	monthselect.blur(function(){
		dayselect[0].length=0;
		var yearChoose=yearselect.val();
		var monthChoose=monthselect.val();
		var yearsLength=yearselect[0].length;
		var monthsLength=monthselect[0].length;
		if(yearChoose==current_year&&monthChoose==current_month){
			var totalDays=getTotalDaysPerMonth(yearChoose,monthChoose);
			if((totalDays-current_day)<pre_days){
				for(var i=current_day;i<=totalDays;++i){
				var option=$("<option/>");
				option.html(i);
				option.attr("value",i);
				dayselect.append(option);
				}
			}else{
				for(var i=current_day;i<=(current_day+pre_days);++i){
				var option=$("<option/>");
				option.html(i);
				option.attr("value",i);
				dayselect.append(option);
				}
			}
		}else{
			if(yearChoose==yearselect[0][yearsLength-1].value&&monthChoose==monthselect[0][monthsLength-1].value){
			
			var restDays=restDaysLastMonth(current_year,current_month,current_day,pre_days);
			for(var i=1;i<=restDays;++i){
				var option=$("<option/>");
				option.html(i);
				option.attr("value",i);
				dayselect.append(option);
				}
			
			
			}else{
				var totalDays=getTotalDaysPerMonth(yearChoose,monthChoose);
				for(var i=1;i<=totalDays;++i){
				var option=$("<option/>");
				option.html(i);
				option.attr("value",i);
				dayselect.append(option);
				}
			}
		}
		
		//if(yearsLength=){
		
		//}
		//alert(monthselect[0][2].value);
		//alert(monthselect[0][monthsLength-1].value);
	});
	dayselect.blur(function(){
		hourselect[0].length=0;
		var yearChoose=yearselect.val();
		var monthChoose=monthselect.val();
		var dayChoose=dayselect.val();
		if(yearChoose==current_year&&monthChoose==current_month&&dayChoose==current_day){
			for(var i=(current_hour+1);i<=24;++i){
			var option=$("<option/>");
			option.html(i);
			option.attr("value",i);
			hourselect.append(option);
			}
		}else{
			for(var i=1;i<=24;++i){
			var option=$("<option/>");
			option.html(i);
			option.attr("value",i);
			hourselect.append(option);
			}
		}
		
		
	});
	
	
	
	
});


var pre_days=90;

var date=new Date();
var current_year=date.getFullYear();
var current_month=date.getMonth()+1;
var current_day=date.getDate();
var current_hour=date.getHours();
var leapYear=isLeapYear(current_year);


//获取预售时间内的跨度年数
function yearsBetween(){
	if(pre_days<=daysDiffToyearEnd(current_year,current_month,current_day)){
		return 1;
	}else{
		return 2;	
	}
}


//获取指定日期到年末的天数差
function daysDiffToyearEnd(year,month,day){
	var countDays=0;
	var totalDays=0;
	for(var i=month;i<=12;++i){
		totalDays=getTotalDaysPerMonth(year,i);
		if(month==i){
			countDays=countDays+totalDays-day;
		}else{
			countDays+=totalDays;
		}	
	}
	return countDays;
}

//获取当前日期到指定天数差日期的月份差
function monthsDiffToyearEnd(year,month,day,daysDiff){
	var countMonths=1;
	var totalDays=0;
	for(var i=month;i<=12;++i){
		totalDays=getTotalDaysPerMonth(year,i);
		if(month==i){
			tempDays=totalDays-day;
			daysDiff=daysDiff-tempDays;
		}else{
			daysDiff=daysDiff-totalDays;
		}
		
		if(daysDiff<=0){
			break;
		}
		countMonths++;
	}
	return countMonths;
}

//获取预售总天数 最后一个月的天数
function restDaysLastMonth(year,month,day,daysDiff){
	
	var restDays=daysDiff;
	var totalDays=0;
	for(var i=month;i<=12;++i){
		totalDays=getTotalDaysPerMonth(year,i);
		if(month==i){
			tempDays=totalDays-day;
			restDays=restDays-tempDays;
		}else{
			restDays=restDays-totalDays;
		}
		
		if(restDays<=totalDays){
			return restDays;
		}
		
	}
	var j=1;
	year=year+1;
	totalDays=getTotalDaysPerMonth(year,j);
	while(restDays>totalDays){
		restDays=restDays-totalDays;
		j++;
		if(j==13){
			j=1;
			year=year+1;
		}
		
		totalDays=getTotalDaysPerMonth(year,j);
	}
}



//获取下一年，剩余天数，预售总共的天数扣去当前年的剩余天数
function RestDaysNextYear(year,month,day,daysDiff){
	var RestDays=daysDiff;
	var totalDays=0;
	for(var i=month;i<=12;++i){
		totalDays=getTotalDaysPerMonth(year,i);
		if(month==i){
			tempDays=totalDays-day;
			RestDays=RestDays-tempDays;
		}else{
			RestDays=RestDays-totalDays;
		}
		
		if(RestDays<=totalDays){
			break;
		}
		
	}
	return RestDays;
}


//获取下一年，剩余月数，预售总共的天数扣去当前年的剩余天数的月数
function RestMonthsNextYear(year,month,day,daysDiff){
	var restDays=RestDaysNextYear(year,month,day,daysDiff);
	var restMonths=1;
	var totalDays=0;
	for(var i=1;i<=12;++i){
		totalDays=getTotalDaysPerMonth(year,i);
		if(month==i){
			tempDays=totalDays-day;
			restDays=restDays-tempDays;
		}else{
			restDays=restDays-totalDays;
		}
		
		if(restDays<=0){
			break;
		}
		restMonths++;
	}
	return restMonths;
}


//获取一个月总天数
function getTotalDaysPerMonth(year,month){
	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
		return 31;
	}
	else if(month==4||month==6||month==9||month==11){
		return 30;
	}else{
		if(isLeapYear(year)){
			return 29;
		}else{
			return 28;
		}
	}
	
}

//判断闰年
function isLeapYear(year){
	if(year%400==0){
		return true;
	}else{
		if(year%100==0){
			return false;
		}else{
			if(year%4==0){
				return true;
			}else{
				return false;
			}
		}
	}
}

var count =0;
function addAddress(){
		if(count%2==0){	
		var newAddress =$("#newaddress");
		var span1=$("<span/>");
		span1.html("&nbsp;&nbsp;收货人姓名：");
		newAddress.append(span1);
		var name=$("<input/>");
		name.attr("type","text");
		name.attr("id","name");
		name.attr("placeholder","收货人姓名");
		newAddress.append(name);
		var span2=$("<span/>");
		span2.html("&nbsp;&nbsp;收货人手机号：");
		newAddress.append(span2);
		var phone=$("<input/>");
		phone.attr("type","text");
		phone.attr("id","phone");
		phone.attr("placeholder","收货人手机号");
		newAddress.append(phone);
		var br=$("<br/>");
		newAddress.append(br);
		var span3=$("<span/>");
		span3.html("&nbsp;&nbsp;收货人地址：");
		newAddress.append(span3);
		var address=$("<input/>");
		address.attr("type","text");
		address.attr("id","address");
		address.attr("placeholder","收货人地址");
		newAddress.append(address);
		var br2=$("<br/>");
		newAddress.append(br2);
		newAddress.append("&nbsp;&nbsp;");
		var confirmbtn=$("<input/>");
		confirmbtn.attr("type","button");
		confirmbtn.attr("id","confirmbtn");
		confirmbtn.attr("value","确认");
		confirmbtn.bind("click",function(){
			newAddress.empty();
			
			
			
			
			//创建异步调用对象
			var xmlHttp;
				function createXMLHttpRequest() {
					if (window.ActiveXObject) {
						xmlHttp = new ActiveXObject("Microsoft.XMLHTTP");
					} else if (window.XMLHttpRequest) {
						xmlHttp = new XMLHttpRequest();
					}
				}
				createXMLHttpRequest();
					xmlHttp.open("POST","AjaxReceiveInfoServlet?name="+name.prop("value")+"&phone="+phone.prop("value")+"&address="+address.prop("value"),true);
					//设置post方式的请求头
					xmlHttp.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
					//服务器返回消息，要执行的方法   这种方式方法后面不要括号
					xmlHttp.onreadystatechange=fun1;
					xmlHttp.send();
				
				//回调方法
				function fun1(){
					if(xmlHttp.readyState==4){
						if(xmlHttp.status==200){
							var table1=$("#table1");
							var newtr=$("<tr/>");
							var newtd1=$("<td/>");
							var newtd2=$("<td/>");
							var newtd3=$("<td/>");
							var newtd4=$("<td/>");
							var newinput=$("<input/>");
							newinput.attr("type","radio");
							newinput.attr("name","xuanze");
							newtd2.text(name.prop("value"));
							newtd3.text(phone.prop("value"));
							newtd4.text(address.prop("value"));
							newtd1.append(newinput);
							newtr.append(newtd1);
							newtr.append(newtd2);
							newtr.append(newtd3);
							newtr.append(newtd4);
							table1.append(newtr);
							//var message=xmlHttp.responseXML.getElementsByTagName("message")[0].innerHTML;
							//var receive_id=xmlHttp.responseXML.getElementsByTagName("message")[0].firstChild.data;
							//alert(xmlHttp.resonpseText);	
							newinput.attr("value",xmlHttp.responseText);
							
						}
					}
				}
	
		});
	

		newAddress.append(confirmbtn);	
		}
		
		if(count%2!=0){
			var newAddress =$("#newaddress");
			newAddress.empty();
		}
		count++;
		
		
		
}


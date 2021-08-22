$(function() {
			doList();
		});

		function doList() {
			$.get("/videoVIP/YhbController/mhselectSql.do", {
				yhzh: form1.yhzh.value,
				yhnc: form1.yhnc.value,
				yhzt: form1.yhzt.value
			}, function(users) {
				if (null != users && users.length > 0) {
					$("#table0").empty();
					for (i = 0; i < users.length; i++) {
						var user = users[i];
						$("#table0").append(
							$("<tr>")
							.append($("<td>").html(i + 1))
							.append($("<td>").html(user.yhzh))
							.append($("<td>").html(user.yhnc))
							.append($("<td>").html(user.yhzt))
							.append(
								$("<td>")
								.append("<a onclick='doUpdate(\"" + user.yhzh + "\")'>修改</a> ")
								.append("<a onclick='doDelete(\"" + user.yhzh + "\")'>删除</a> ")
							)
						);
					}
				}
			}, "json")
		}

		function showUpdateWindow() {
			var bh = sessionStorage.getItem("yhzh"); // 从 sessionStorage 中获取用户编号

			// 通过 主键编号 获取用户信息，然后回显在表单中
			$(function() {
				$.post("/videoVIP/YhbController/selectById.do?yhzh=" + bh, function(user) {
					$("#yhzh").val(user.yhzh);
					$("#yhnc").val(user.yhnc);
					$("#yhzt").val(user.yhzt);
				});
			});
			$("#updateWindow").show("slow");
		}

		function closeUpdateWindow() {
			$("#updateWindow").hide("slow");
		}

		function doUpdate(bh) {
			sessionStorage.setItem("yhzh", bh); // 将 主键编号存放在 sessionStorage 中
			showUpdateWindow();
		}

		function trueUpdate(bh) {
			$.post("/videoVIP/YhbController/update.do", {
					yhzh: $("#yhzh").val(),
					yhnc: $("#yhnc").val(),
					yhzt: $("#yhzt").val()
				},
				function(ret) {
					if (ret == true) {
						$("#title").html("更新成功！");
						closeUpdateWindow();
						doList();
					} else {
						$("#title").html("更新失败！");
					}
				}
			);
		}

		function doDelete(bh) {
			$.post("/videoVIP/YhbController/deleteById.do", {
					yhzh: bh
				},
				function(ret) {
					if (ret == false) {
						alert("删除失败！");
					} else {
						doList();
					}
				});
		}


		/**显示修改窗口*/
		/* function showUpdateWindow(){
			$("#updateWindow").show("slow");
		} */
		/**关闭修改窗口*/
		/* function closeUpdateWindow(){
			$("#updateWindow").hide("slow");
		} */

		/* $.ajax({
			type:"post",
			url:"/videoVIP/YhbController/list.do",
			dateType:"json",
			success:function(data){
				var yh = '';
				for(i=1;i<data.length+1;i++){
					yh += '<tr id="yh" >'
					+'<td>'+i+'</td>'
					+'<td>'+data[i-1].yhzh+'</td>'
					+'<td>'+data[i-1].yhnc+'</td>'
					+'<td>'+data[i-1].yhzt+'</td>'
					+'<td><a onclick="showUpdateWindow()">修改</a><a href="#">删除</a></td>'
					+'</tr>';
				}
				$("#table0").append(yh);
			}
		})  */
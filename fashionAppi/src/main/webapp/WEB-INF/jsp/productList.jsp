<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    


<html>

<h2>hello from product list</h2>


<div class="alert">
<span class="closebtn" onclick="this.parentElement.style.display='none';">&times;</span>
some text here
</div>



<%--form --%>

<div>
	<form id="form1" action="productList">
	<input type="number" name="number" id="number" />
	<button type="submit" id="btn1" name="noname" value="go" class="btn-link">go</button>
	</form>
</div>






</html>











<script>

var close = document.getElementByClassNam("closebtn");
var i;

for(i=0;i<close.length;i++){
	close[i].onclick = function() {
		var div = this.parentElement;
		
		div.style.opacity="0";
		
		setTimeout(function()){
			div.style.display = "none";}, 600};
		}
	}
	
$(document).ready(function(){
	$('#btn1').click(function(){
		document.getElementById('form1').submit();
	});
});

</script>
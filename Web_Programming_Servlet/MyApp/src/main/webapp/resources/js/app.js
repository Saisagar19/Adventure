/**
 * 
 */

function validate() {
	let ele = document.regForm;
	if (ele.txtFirstName.value == "") {
		alert("FirstName Not should not be empty");
		return false;
	}
	if (ele.terms.checked == false) {
		alert("Agree terms and conditions!!");
		return false;
	}
	if ((ele.gender[0].checked == false) && (ele.gender[1].checked == false)) {
		alert("Select your gender");
		return false;
	}
	if (ele.age.selectIndex == 0) {
		alert("Select your age group");
		return false;
	}
}
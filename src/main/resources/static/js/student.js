document.getElementById("insertBtn").addEventListener("click", () => {
    if (!chkData("#studentNumber", "학번을")) return;
    else if (!chkData("#subjectNumber", "학과번호를")) return;
    else if (!chkData("#studentId", "아이디를")) return;
    else if (!chkData("#studentPassword", "비밀번호를")) return;
    else if (!chkData("#studentBirth", "생년월일을")) return;
    else if (!chkData("#studentPhone", "전화번호를")) return;
    else if (!chkData("#studentAddress", "주소를")) return;
    else if (!chkData("#studentEmail", "이메일을")) return;
    else if (!chkData("#date", "입학일을")) return;
    else {

        const isNew = document.getElementById("studentNumber").value === "0";
        const actionUrl = isNew ? "/student/studentInsert" : "/student/studentUpdate";
        formSubmit("insertForm", "post", actionUrl);
    }
});

document.getElementById("cancelBtn").addEventListener("click", () => {
   formReset("insertForm");
});
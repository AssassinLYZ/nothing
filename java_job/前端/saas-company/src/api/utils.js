
//	此资源由 58学课资源站 收集整理
//	想要获取完整课件资料 请访问：58xueke.com
//	百万资源 畅享学习
// exports.notEmpty = name => v =>
//     !v || v.trim() === '' ? `${name} is required` : true

export function isEmpty(str) {
    if (str === null || str === undefined || str === '') {
        return true;
    } else {
        return false;
    }
}

export function isNumber(number) {
    var regPos = /^\d+$/; // 非负整数 
    if(regPos.test(number)){
        return true;
    }else{
        return false;
    } 
}

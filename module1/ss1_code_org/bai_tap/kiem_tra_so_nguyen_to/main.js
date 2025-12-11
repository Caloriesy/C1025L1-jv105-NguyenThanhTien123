function iselement(n) {
    if (n < 2) {
        return false;
    }
    let bool = true;
    for (let i = 2; i < n; i++) {
        if (n % i === 0) {
            bool = false;
        }
    }
    return bool;
}
let a = prompt("nhap");
    let element= iselement(a);
    if (element == true){
        alert("la so nguyen to");
    }
    else{
        alert("ko phai la so nguyen to")
    }
    

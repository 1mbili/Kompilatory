declare i32 @printf(i8*, ...)
declare i32 @__isoc99_scanf(i8*, ...)
@strp = constant [4 x i8] c"%d\0A\00"
@strs = constant [3 x i8] c"%d\00"
@strf = constant [4 x i8] c"%f\0A\00"
@strd = constant [4 x i8] c"%lf\00"
@strl = constant [6 x i8] c"%lld\0A\00"
@a = global double 0.0
define i32 @an() nounwind {
%an = alloca i32
%a = alloca i32
store i32 10, i32* %a
%1 = load i32, i32* %a
%2 = load i32, i32* %a
%3 = mul i32 %2, %1
store i32 %3, i32* %an
%4 = load i32, i32* %an
ret i32 %4
}
define i32 @main() nounwind{
store double 11.0, double* @a
%1 = call i32 @an()
%b = alloca i32
store i32 %1, i32* %b
%2 = load double, double* @a
%3 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strf, i32 0, i32 0), double %2)
%4 = load i32, i32* %b
%5 = call i32 (i8*, ...) @printf(i8* getelementptr inbounds ([4 x i8], [4 x i8]* @strp, i32 0, i32 0), i32 %4)
ret i32 0 }

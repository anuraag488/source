package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ys2 implements mb4 {

    /* JADX INFO: renamed from: a */
    public short f35499a;

    /* JADX INFO: renamed from: b */
    public mb4[] f35500b;

    /* JADX INFO: renamed from: c */
    public zs2 f35501c;

    @Override // p000.mb4
    /* JADX INFO: renamed from: a */
    public final StackTraceElement[] mo8265a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        short s = this.f35499a;
        if (length <= s) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrMo8265a = stackTraceElementArr;
        for (mb4 mb4Var : this.f35500b) {
            if (stackTraceElementArrMo8265a.length <= s) {
                break;
            }
            stackTraceElementArrMo8265a = mb4Var.mo8265a(stackTraceElementArr);
        }
        return stackTraceElementArrMo8265a.length > s ? this.f35501c.mo8265a(stackTraceElementArrMo8265a) : stackTraceElementArrMo8265a;
    }
}

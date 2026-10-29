package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class oj1 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public ti1 f26779t;

    /* JADX INFO: renamed from: u */
    public byte f26780u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ ti1 f26781v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f26782w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ mq1 f26783x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oj1(mq1 mq1Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f26783x = mq1Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        oj1 oj1Var = new oj1(this.f26783x, (wm0) obj3);
        oj1Var.f26781v = (ti1) obj;
        oj1Var.f26782w = obj2;
        return oj1Var.invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r8, r7) == r2) goto L15;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ti1 ti1Var = this.f26781v;
        Object obj2 = this.f26782w;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f26780u;
        if (b != 0) {
            if (b == 1) {
                ti1Var = this.f26779t;
                k43.m7376J(obj);
            } else {
                if (b != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
            }
            return ju4.f22634a;
        }
        k43.m7376J(obj);
        this.f26781v = null;
        this.f26782w = null;
        this.f26779t = ti1Var;
        this.f26780u = (byte) 1;
        obj = this.f26783x.invoke(obj2, this);
        if (obj != ap0Var) {
        }
        return ap0Var;
        this.f26781v = null;
        this.f26782w = null;
        this.f26779t = null;
        this.f26780u = (byte) 2;
    }
}

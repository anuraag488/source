package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ek4 extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public boolean f18186t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ df3 f18187u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ long f18188v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ zo0 f18189w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ sw2 f18190x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek4(zo0 zo0Var, sw2 sw2Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f18189w = zo0Var;
        this.f18190x = sw2Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((b33) obj2).f15059a;
        ek4 ek4Var = new ek4(this.f18189w, this.f18190x, (wm0) obj3);
        ek4Var.f18187u = (df3) obj;
        ek4Var.f18188v = j;
        return ek4Var.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f18186t;
        sw2 sw2Var = this.f18190x;
        zo0 zo0Var = this.f18189w;
        if (!z) {
            k43.m7376J(obj);
            df3 df3Var = this.f18187u;
            lb5.m7910S(zo0Var, null, null, new hy3(this.f18188v, null, sw2Var), 3);
            this.f18186t = true;
            obj = df3Var.m4501h(this);
            if (obj == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        lb5.m7910S(zo0Var, null, null, new C0982og(sw2Var, ((Boolean) obj).booleanValue(), (wm0) null), 3);
        return ju4.f22634a;
    }
}

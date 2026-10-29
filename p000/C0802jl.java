package p000;

/* JADX INFO: renamed from: jl */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0802jl extends of4 implements nq1 {

    /* JADX INFO: renamed from: t */
    public boolean f22378t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ float f22379u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ a91 f22380v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0802jl(a91 a91Var, wm0 wm0Var) {
        super(3, wm0Var);
        this.f22380v = a91Var;
    }

    @Override // p000.nq1
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float fFloatValue = ((Number) obj2).floatValue();
        C0802jl c0802jl = new C0802jl(this.f22380v, (wm0) obj3);
        c0802jl.f22379u = fFloatValue;
        return c0802jl.invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        float f = this.f22379u;
        ap0 ap0Var = ap0.f14763a;
        boolean z = this.f22378t;
        if (!z) {
            k43.m7376J(obj);
            a91 a91Var = this.f22380v;
            ho4 ho4Var = a91Var.f176a;
            gv0 gv0Var = a91Var.f178c;
            ag1 ag1Var = a91Var.f177b;
            this.f22379u = f;
            this.f22378t = true;
            if (AbstractC0913ml.m8343d(ho4Var, f, gv0Var, ag1Var, this) == ap0Var) {
                return ap0Var;
            }
        } else {
            if (!z) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        return ju4.f22634a;
    }
}

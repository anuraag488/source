package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class gu0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public boolean f20123t;

    /* JADX INFO: renamed from: u */
    public /* synthetic */ boolean f20124u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ ru0 f20125v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f20126w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gu0(ru0 ru0Var, int i, wm0 wm0Var) {
        super(2, wm0Var);
        this.f20125v = ru0Var;
        this.f20126w = i;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        gu0 gu0Var = new gu0(this.f20125v, this.f20126w, wm0Var);
        gu0Var.f20124u = ((Boolean) obj).booleanValue();
        return gu0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((gu0) create((wm0) obj2, bool)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        boolean z = this.f20124u;
        ap0 ap0Var = ap0.f14763a;
        boolean z2 = this.f20123t;
        if (!z2) {
            k43.m7376J(obj);
            if (z) {
                c74 c74VarM10430c = this.f20125v.m10430c();
                this.f20124u = z;
                this.f20123t = true;
                obj = c74VarM10430c.m3865a();
                if (obj == ap0Var) {
                    return ap0Var;
                }
            } else {
                iIntValue = this.f20126w;
            }
            return new Integer(iIntValue);
        }
        if (!z2) {
            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        k43.m7376J(obj);
        iIntValue = ((Number) obj).intValue();
        return new Integer(iIntValue);
    }
}

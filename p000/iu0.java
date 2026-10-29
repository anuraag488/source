package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class iu0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public Object f21780t;

    /* JADX INFO: renamed from: u */
    public int f21781u;

    /* JADX INFO: renamed from: v */
    public byte f21782v;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ boolean f21783w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ru0 f21784x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ mq1 f21785y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu0(ru0 ru0Var, mq1 mq1Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f21784x = ru0Var;
        this.f21785y = mq1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        iu0 iu0Var = new iu0(this.f21784x, this.f21785y, wm0Var);
        iu0Var.f21783w = ((Boolean) obj).booleanValue();
        return iu0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((iu0) create((wm0) obj2, bool)).invokeSuspend(ju4.f22634a);
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        int i;
        boolean z = this.f21783w;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f21782v;
        if (b == 0) {
            k43.m7376J(obj);
            this.f21783w = z;
            this.f21782v = (byte) 1;
            obj = this.f21784x.m10434g(this);
            if (obj != ap0Var) {
            }
            return ap0Var;
        }
        if (b == 1) {
            k43.m7376J(obj);
        } else {
            if (b != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f21781u;
            obj2 = this.f21780t;
            k43.m7376J(obj);
        }
        return new at0(i, ((Number) obj).intValue(), obj2);
        int iHashCode = obj != null ? obj.hashCode() : 0;
        Boolean boolValueOf = Boolean.valueOf(z);
        this.f21780t = obj;
        this.f21783w = z;
        this.f21781u = iHashCode;
        this.f21782v = (byte) 2;
        Object objInvoke = this.f21785y.invoke(boolValueOf, this);
        if (objInvoke != ap0Var) {
            Object obj3 = obj;
            obj = objInvoke;
            obj2 = obj3;
            i = iHashCode;
            return new at0(i, ((Number) obj).intValue(), obj2);
        }
        return ap0Var;
    }
}

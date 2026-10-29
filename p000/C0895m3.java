package p000;

/* JADX INFO: renamed from: m3 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0895m3 extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ yp1 f24607A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ yp1 f24608B;

    /* JADX INFO: renamed from: t */
    public byte f24609t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ u93 f24610u;

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ boolean f24611v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ dz0 f24612w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f24613x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1354y3 f24614y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ byte f24615z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0895m3(u93 u93Var, boolean z, dz0 dz0Var, boolean z2, C1354y3 c1354y3, int i, yp1 yp1Var, yp1 yp1Var2, wm0 wm0Var) {
        super(1, wm0Var);
        this.f24610u = u93Var;
        this.f24611v = z;
        this.f24612w = dz0Var;
        this.f24613x = z2;
        this.f24614y = c1354y3;
        this.f24615z = i;
        this.f24607A = yp1Var;
        this.f24608B = yp1Var2;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        yp1 yp1Var = this.f24607A;
        yp1 yp1Var2 = this.f24608B;
        return new C0895m3(this.f24610u, this.f24611v, this.f24612w, this.f24613x, this.f24614y, this.f24615z, yp1Var, yp1Var2, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005b, code lost:
    
        if (r10 == r0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r10 == r0) goto L42;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C0858l3 c0858l3;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f24609t;
        ju4 ju4Var = ju4.f22634a;
        if (b == 0) {
            k43.m7376J(obj);
            this.f24609t = (byte) 1;
            obj = this.f24610u.mo11771c(this);
            if (obj != ap0Var) {
            }
        }
        if (b == 1) {
            k43.m7376J(obj);
        } else {
            if (b == 2) {
                k43.m7376J(obj);
                c0858l3 = new C0858l3(this.f24607A, this.f24608B, (wm0) null, (byte) 0);
                this.f24609t = (byte) 4;
                if (zp0.m13685q(c0858l3, this) != ap0Var) {
                }
            }
            if (b == 3) {
                k43.m7376J(obj);
                c0858l3 = new C0858l3(this.f24607A, this.f24608B, (wm0) null, (byte) 0);
                this.f24609t = (byte) 4;
                if (zp0.m13685q(c0858l3, this) != ap0Var) {
                }
            }
            if (b != 4) {
                if (b != 5) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                Object obj2 = ((ep3) obj).f18355a;
                return ju4Var;
            }
            k43.m7376J(obj);
        }
        this.f24609t = (byte) 5;
        return this.f24614y.m12816b(this.f24615z) == ap0Var ? ap0Var : ju4Var;
        if (((Boolean) obj).booleanValue()) {
            boolean z = this.f24611v;
            dz0 dz0Var = this.f24612w;
            if (z) {
                if (dz0Var != null) {
                    this.f24609t = (byte) 2;
                    obj = dz0Var.m4804c(this);
                } else {
                    c0858l3 = new C0858l3(this.f24607A, this.f24608B, (wm0) null, (byte) 0);
                    this.f24609t = (byte) 4;
                    if (zp0.m13685q(c0858l3, this) != ap0Var) {
                        this.f24609t = (byte) 5;
                        if (this.f24614y.m12816b(this.f24615z) == ap0Var) {
                        }
                    }
                }
            } else if (!this.f24613x || dz0Var == null) {
                c0858l3 = new C0858l3(this.f24607A, this.f24608B, (wm0) null, (byte) 0);
                this.f24609t = (byte) 4;
                if (zp0.m13685q(c0858l3, this) != ap0Var) {
                    this.f24609t = (byte) 5;
                    if (this.f24614y.m12816b(this.f24615z) == ap0Var) {
                    }
                }
            } else {
                this.f24609t = (byte) 3;
                obj = dz0Var.m4803b(true, this);
            }
        }
    }
}

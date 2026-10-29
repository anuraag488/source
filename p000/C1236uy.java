package p000;

/* JADX INFO: renamed from: uy */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1236uy extends bp3 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ zo0 f32239A;

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ co4 f32240B;

    /* JADX INFO: renamed from: u */
    public ac4 f32241u;

    /* JADX INFO: renamed from: v */
    public fc3 f32242v;

    /* JADX INFO: renamed from: w */
    public long f32243w;

    /* JADX INFO: renamed from: x */
    public int f32244x;

    /* JADX INFO: renamed from: y */
    public byte f32245y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f32246z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236uy(zo0 zo0Var, co4 co4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f32239A = zo0Var;
        this.f32240B = co4Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        C1236uy c1236uy = new C1236uy(this.f32239A, this.f32240B, wm0Var);
        c1236uy.f32246z = obj;
        return c1236uy;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((C1236uy) create((wm0) obj2, (uf4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[Catch: all -> 0x0020, TRY_LEAVE, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x0019, B:40:0x00c1, B:42:0x00c5), top: B:48:0x0019 }] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        ac4 ac4VarM3547a;
        long jMo5858c;
        fc3 fc3Var;
        Object objM5718b;
        int i;
        fc3 fc3Var2;
        ac4 ac4Var;
        ac4 ac4Var2;
        Object objM5725i;
        lc3 lc3Var;
        uf4 uf4Var = (uf4) this.f32246z;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f32245y;
        byte b2 = 0;
        wm0 wm0Var = null;
        if (b == 0) {
            k43.m7376J(obj);
            ac4VarM3547a = bc4.m3547a(Boolean.FALSE);
            jMo5858c = uf4Var.m11540k().mo5858c();
            fc3Var = fc3.f18903a;
            this.f32246z = uf4Var;
            this.f32241u = ac4VarM3547a;
            this.f32242v = fc3Var;
            this.f32243w = jMo5858c;
            this.f32245y = (byte) 1;
            objM5718b = fi4.m5718b(uf4Var, this, 1);
            if (objM5718b != ap0Var) {
            }
            return ap0Var;
        }
        if (b != 1) {
            if (b != 2) {
                if (b != 3) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ac4Var2 = this.f32241u;
                try {
                    k43.m7376J(obj);
                    objM5725i = obj;
                    lc3Var = (lc3) objM5725i;
                    if (lc3Var != null) {
                        lc3Var.m7952a();
                    }
                    Boolean bool = Boolean.FALSE;
                    ac4Var2.getClass();
                    ac4Var2.m200k(null, bool);
                    return ju4.f22634a;
                } catch (Throwable th) {
                    th = th;
                    Boolean bool2 = Boolean.FALSE;
                    ac4Var2.getClass();
                    ac4Var2.m200k(null, bool2);
                    throw th;
                }
            }
            int i2 = this.f32244x;
            jMo5858c = this.f32243w;
            fc3Var2 = this.f32242v;
            ac4Var = this.f32241u;
            try {
                k43.m7376J(obj);
                Boolean bool3 = Boolean.FALSE;
                ac4Var.getClass();
                ac4Var.m200k(null, bool3);
            } catch (gc3 unused) {
                i = i2;
                ac4VarM3547a = ac4Var;
                lb5.m7910S(this.f32239A, null, cp0.f16328d, new C1199ty(ac4VarM3547a, this.f32240B, wm0Var, b2), 1);
                this.f32246z = null;
                this.f32241u = ac4VarM3547a;
                this.f32242v = null;
                this.f32243w = jMo5858c;
                this.f32244x = i;
                this.f32245y = (byte) 3;
                objM5725i = fi4.m5725i(uf4Var, fc3Var2, this);
                if (objM5725i != ap0Var) {
                    ac4Var2 = ac4VarM3547a;
                    lc3Var = (lc3) objM5725i;
                    if (lc3Var != null) {
                        lc3Var.m7952a();
                    }
                    Boolean bool4 = Boolean.FALSE;
                    ac4Var2.getClass();
                    ac4Var2.m200k(null, bool4);
                }
                return ap0Var;
            } catch (Throwable th2) {
                th = th2;
                ac4Var2 = ac4Var;
                Boolean bool5 = Boolean.FALSE;
                ac4Var2.getClass();
                ac4Var2.m200k(null, bool5);
                throw th;
            }
            return ju4.f22634a;
        }
        jMo5858c = this.f32243w;
        fc3 fc3Var3 = this.f32242v;
        ac4 ac4Var3 = this.f32241u;
        k43.m7376J(obj);
        fc3Var = fc3Var3;
        ac4VarM3547a = ac4Var3;
        objM5718b = obj;
        i = ((lc3) objM5718b).f23943i;
        if (i == 1 || i == 3) {
            try {
                try {
                    C1162sy c1162sy = new C1162sy(fc3Var, wm0Var, b2);
                    this.f32246z = uf4Var;
                    this.f32241u = ac4VarM3547a;
                    this.f32242v = fc3Var;
                    this.f32243w = jMo5858c;
                    this.f32244x = i;
                    this.f32245y = (byte) 2;
                    if (uf4Var.m11541l(jMo5858c, c1162sy, this) != ap0Var) {
                        ac4Var = ac4VarM3547a;
                        Boolean bool6 = Boolean.FALSE;
                        ac4Var.getClass();
                        ac4Var.m200k(null, bool6);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    ac4Var2 = ac4VarM3547a;
                    Boolean bool7 = Boolean.FALSE;
                    ac4Var2.getClass();
                    ac4Var2.m200k(null, bool7);
                    throw th;
                }
            } catch (gc3 unused2) {
                fc3Var2 = fc3Var;
                lb5.m7910S(this.f32239A, null, cp0.f16328d, new C1199ty(ac4VarM3547a, this.f32240B, wm0Var, b2), 1);
                this.f32246z = null;
                this.f32241u = ac4VarM3547a;
                this.f32242v = null;
                this.f32243w = jMo5858c;
                this.f32244x = i;
                this.f32245y = (byte) 3;
                objM5725i = fi4.m5725i(uf4Var, fc3Var2, this);
                if (objM5725i != ap0Var) {
                    ac4Var2 = ac4VarM3547a;
                    lc3Var = (lc3) objM5725i;
                    if (lc3Var != null) {
                        lc3Var.m7952a();
                    }
                    Boolean bool8 = Boolean.FALSE;
                    ac4Var2.getClass();
                    ac4Var2.m200k(null, bool8);
                    return ju4.f22634a;
                }
            }
            return ap0Var;
        }
        return ju4.f22634a;
    }
}

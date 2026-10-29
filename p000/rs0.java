package p000;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class rs0 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public qo4 f29571t;

    /* JADX INFO: renamed from: u */
    public byte f29572u;

    /* JADX INFO: renamed from: v */
    public /* synthetic */ Object f29573v;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f29574w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f29575x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ WorkDatabase f29576y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ yp1 f29577z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs0(wm0 wm0Var, yp1 yp1Var, WorkDatabase workDatabase, boolean z, boolean z2) {
        super(2, wm0Var);
        this.f29574w = z;
        this.f29575x = z2;
        this.f29576y = workDatabase;
        this.f29577z = yp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        rs0 rs0Var = new rs0(wm0Var, this.f29577z, this.f29576y, this.f29574w, this.f29575x);
        rs0Var.f29573v = obj;
        return rs0Var;
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        return ((rs0) create((wm0) obj2, (cf4) obj)).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009d A[DONT_INVERT, PHI: r1 r12
  0x009d: PHI (r1v11 cf4) = (r1v8 cf4), (r1v16 cf4) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r12v15 java.lang.Object) = (r12v13 java.lang.Object), (r12v0 java.lang.Object) binds: [B:34:0x009a, B:11:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c3 A[RETURN] */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) {
        qo4 qo4Var;
        cf4 cf4Var;
        qo4 qo4Var2;
        cf4 cf4Var2;
        cf4 cf4Var3;
        Object objM4013c;
        Object obj2;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f29572u;
        yp1 yp1Var = this.f29577z;
        WorkDatabase workDatabase = this.f29576y;
        boolean z = this.f29575x;
        if (b == 0) {
            k43.m7376J(obj);
            cf4 cf4Var4 = (cf4) this.f29573v;
            if (!this.f29574w) {
                return yp1Var.invoke(cf4Var4.mo2969b());
            }
            qo4Var = z ? qo4.f28644a : qo4.f28645b;
            if (z) {
                qo4 qo4Var3 = qo4Var;
                cf4Var = cf4Var4;
                qo4Var2 = qo4Var3;
                qs0 qs0Var = new qs0(null, yp1Var, (byte) 0);
                this.f29573v = cf4Var;
                this.f29571t = null;
                this.f29572u = (byte) 3;
                obj = cf4Var.m4015e(qo4Var2, qs0Var, this);
                if (obj != ap0Var) {
                    if (z) {
                        return obj;
                    }
                    this.f29573v = obj;
                    this.f29572u = (byte) 4;
                    objM4013c = cf4Var.m4013c(this);
                    if (objM4013c != ap0Var) {
                        Object obj3 = obj;
                        obj = objM4013c;
                        obj2 = obj3;
                        if (!((Boolean) obj).booleanValue()) {
                            n72 n72VarM3064g = workDatabase.m3064g();
                            n72VarM3064g.f25491b.m8373e(n72VarM3064g.f25494e, n72VarM3064g.f25495f);
                        }
                        return obj2;
                    }
                }
            } else {
                this.f29573v = cf4Var4;
                this.f29571t = qo4Var;
                this.f29572u = (byte) 1;
                Object objM4013c2 = cf4Var4.m4013c(this);
                if (objM4013c2 != ap0Var) {
                    cf4Var2 = cf4Var4;
                    obj = objM4013c2;
                }
            }
            return ap0Var;
        }
        if (b == 1) {
            qo4Var = this.f29571t;
            cf4Var2 = (cf4) this.f29573v;
            k43.m7376J(obj);
        } else {
            if (b == 2) {
                qo4Var = this.f29571t;
                cf4Var3 = (cf4) this.f29573v;
                k43.m7376J(obj);
                qo4Var2 = qo4Var;
                cf4Var = cf4Var3;
                qs0 qs0Var2 = new qs0(null, yp1Var, (byte) 0);
                this.f29573v = cf4Var;
                this.f29571t = null;
                this.f29572u = (byte) 3;
                obj = cf4Var.m4015e(qo4Var2, qs0Var2, this);
                if (obj != ap0Var) {
                    if (z) {
                        return obj;
                    }
                    this.f29573v = obj;
                    this.f29572u = (byte) 4;
                    objM4013c = cf4Var.m4013c(this);
                    if (objM4013c != ap0Var) {
                        Object obj4 = obj;
                        obj = objM4013c;
                        obj2 = obj4;
                    }
                }
                return ap0Var;
            }
            if (b == 3) {
                cf4Var = (cf4) this.f29573v;
                k43.m7376J(obj);
                if (z) {
                    return obj;
                }
                this.f29573v = obj;
                this.f29572u = (byte) 4;
                objM4013c = cf4Var.m4013c(this);
                if (objM4013c != ap0Var) {
                    Object obj5 = obj;
                    obj = objM4013c;
                    obj2 = obj5;
                }
                return ap0Var;
            }
            if (b != 4) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.f29573v;
            k43.m7376J(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            n72 n72VarM3064g2 = workDatabase.m3064g();
            n72VarM3064g2.f25491b.m8373e(n72VarM3064g2.f25494e, n72VarM3064g2.f25495f);
        }
        return obj2;
        if (((Boolean) obj).booleanValue()) {
            qo4Var2 = qo4Var;
            cf4Var = cf4Var2;
            qs0 qs0Var3 = new qs0(null, yp1Var, (byte) 0);
            this.f29573v = cf4Var;
            this.f29571t = null;
            this.f29572u = (byte) 3;
            obj = cf4Var.m4015e(qo4Var2, qs0Var3, this);
            if (obj != ap0Var) {
                if (z) {
                    return obj;
                }
                this.f29573v = obj;
                this.f29572u = (byte) 4;
                objM4013c = cf4Var.m4013c(this);
                if (objM4013c != ap0Var) {
                    Object obj6 = obj;
                    obj = objM4013c;
                    obj2 = obj6;
                    if (!((Boolean) obj).booleanValue()) {
                        n72 n72VarM3064g3 = workDatabase.m3064g();
                        n72VarM3064g3.f25491b.m8373e(n72VarM3064g3.f25494e, n72VarM3064g3.f25495f);
                    }
                    return obj2;
                }
            }
        } else {
            n72 n72VarM3064g4 = workDatabase.m3064g();
            this.f29573v = cf4Var2;
            this.f29571t = qo4Var;
            this.f29572u = (byte) 2;
            if (n72VarM3064g4.m8568a(this) != ap0Var) {
                cf4Var3 = cf4Var2;
                qo4Var2 = qo4Var;
                cf4Var = cf4Var3;
                qs0 qs0Var4 = new qs0(null, yp1Var, (byte) 0);
                this.f29573v = cf4Var;
                this.f29571t = null;
                this.f29572u = (byte) 3;
                obj = cf4Var.m4015e(qo4Var2, qs0Var4, this);
                if (obj != ap0Var) {
                    if (z) {
                        return obj;
                    }
                    this.f29573v = obj;
                    this.f29572u = (byte) 4;
                    objM4013c = cf4Var.m4013c(this);
                    if (objM4013c != ap0Var) {
                        Object obj7 = obj;
                        obj = objM4013c;
                        obj2 = obj7;
                        if (!((Boolean) obj).booleanValue()) {
                            n72 n72VarM3064g5 = workDatabase.m3064g();
                            n72VarM3064g5.f25491b.m8373e(n72VarM3064g5.f25494e, n72VarM3064g5.f25495f);
                        }
                        return obj2;
                    }
                }
            }
        }
        return ap0Var;
    }
}

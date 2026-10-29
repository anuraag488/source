package p000;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ku0 extends of4 implements yp1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ mq1 f23506A;

    /* JADX INFO: renamed from: t */
    public gp0 f23507t;

    /* JADX INFO: renamed from: u */
    public Object f23508u;

    /* JADX INFO: renamed from: v */
    public Serializable f23509v;

    /* JADX INFO: renamed from: w */
    public int f23510w;

    /* JADX INFO: renamed from: x */
    public byte f23511x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f23512y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ ru0 f23513z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku0(boolean z, ru0 ru0Var, mq1 mq1Var, wm0 wm0Var) {
        super(1, wm0Var);
        this.f23512y = z;
        this.f23513z = ru0Var;
        this.f23506A = mq1Var;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        ru0 ru0Var = this.f23513z;
        mq1 mq1Var = this.f23506A;
        return new ku0(this.f23512y, ru0Var, mq1Var, (wm0) obj).invokeSuspend(ju4.f22634a);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: gp0 -> 0x0050, TryCatch #1 {gp0 -> 0x0050, blocks: (B:17:0x004a, B:42:0x00ae, B:22:0x0056, B:37:0x0090, B:23:0x005d, B:31:0x0074, B:33:0x007a, B:27:0x0068, B:39:0x009c), top: B:67:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws IllegalAccessException, gp0, InvocationTargetException {
        Object objMo6468a;
        ql3 ql3Var;
        gp0 gp0Var;
        ql3 ql3Var2;
        gp0 gp0Var2;
        ql3 ql3Var3;
        ol3 ol3Var;
        Object objM3867c;
        Object objM10434g;
        int iHashCode;
        Object objInvoke;
        Object obj2;
        int i;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f23511x;
        mq1 mq1Var = this.f23506A;
        boolean z = this.f23512y;
        ru0 ru0Var = this.f23513z;
        try {
            if (b == 0) {
                k43.m7376J(obj);
                if (!z) {
                    c74 c74VarM10430c = ru0Var.m10430c();
                    iu0 iu0Var = new iu0(ru0Var, mq1Var, null);
                    this.f23511x = (byte) 3;
                    objM3867c = c74VarM10430c.m3867c(iu0Var, this);
                    if (objM3867c == ap0Var) {
                    }
                    return (at0) objM3867c;
                }
                this.f23511x = (byte) 1;
                objM10434g = ru0Var.m10434g(this);
                if (objM10434g != ap0Var) {
                    if (objM10434g != null) {
                        iHashCode = objM10434g.hashCode();
                    } else {
                        iHashCode = 0;
                    }
                    Boolean boolValueOf = Boolean.valueOf(z);
                    this.f23507t = null;
                    this.f23508u = objM10434g;
                    this.f23510w = iHashCode;
                    this.f23511x = (byte) 2;
                    objInvoke = mq1Var.invoke(boolValueOf, this);
                    if (objInvoke != ap0Var) {
                        obj2 = objM10434g;
                        i = iHashCode;
                        return new at0(i, ((Number) objInvoke).intValue(), obj2);
                    }
                }
                return ap0Var;
            }
            if (b == 1) {
                k43.m7376J(obj);
                objM10434g = obj;
                if (objM10434g != null) {
                    iHashCode = objM10434g.hashCode();
                } else {
                    iHashCode = 0;
                }
                Boolean boolValueOf2 = Boolean.valueOf(z);
                this.f23507t = null;
                this.f23508u = objM10434g;
                this.f23510w = iHashCode;
                this.f23511x = (byte) 2;
                objInvoke = mq1Var.invoke(boolValueOf2, this);
                if (objInvoke != ap0Var) {
                    return ap0Var;
                }
                obj2 = objM10434g;
                i = iHashCode;
            } else {
                if (b != 2) {
                    if (b == 3) {
                        k43.m7376J(obj);
                        objM3867c = obj;
                        return (at0) objM3867c;
                    }
                    if (b != 4) {
                        if (b != 5) {
                            C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ol3Var = (ol3) this.f23509v;
                        ql3Var3 = (ql3) this.f23508u;
                        gp0Var2 = this.f23507t;
                        try {
                            k43.m7376J(obj);
                            Object obj3 = ql3Var3.f28555a;
                            return new at0(obj3 != null ? obj3.hashCode() : 0, ol3Var.f26851a, obj3);
                        } catch (Throwable th) {
                            th = th;
                            se0.m10720f(gp0Var2, th);
                            throw gp0Var2;
                        }
                    }
                    ql3Var2 = (ql3) this.f23509v;
                    ql3 ql3Var4 = (ql3) this.f23508u;
                    gp0 gp0Var3 = this.f23507t;
                    k43.m7376J(obj);
                    ql3Var = ql3Var4;
                    gp0Var = gp0Var3;
                    objMo6468a = obj;
                    ql3Var2.f28555a = objMo6468a;
                    ol3 ol3Var2 = new ol3();
                    try {
                        boolean z2 = this.f23512y;
                        ju0 ju0Var = new ju0(ql3Var, ru0Var, ol3Var2, this.f23506A, z2, null);
                        this.f23507t = gp0Var;
                        this.f23508u = ql3Var;
                        this.f23509v = ol3Var2;
                        this.f23511x = (byte) 5;
                        if ((z2 ? ju0Var.invoke(this) : ru0Var.m10430c().m3866b(new C1020p3(ju0Var, null, (byte) 3), this)) != ap0Var) {
                            ql3Var3 = ql3Var;
                            ol3Var = ol3Var2;
                            Object obj4 = ql3Var3.f28555a;
                            return new at0(obj4 != null ? obj4.hashCode() : 0, ol3Var.f26851a, obj4);
                        }
                        return ap0Var;
                    } catch (Throwable th2) {
                        th = th2;
                        gp0Var2 = gp0Var;
                        se0.m10720f(gp0Var2, th);
                        throw gp0Var2;
                    }
                }
                i = this.f23510w;
                Object obj5 = this.f23508u;
                k43.m7376J(obj);
                obj2 = obj5;
                objInvoke = obj;
            }
            return new at0(i, ((Number) objInvoke).intValue(), obj2);
        } catch (gp0 e) {
            ql3 ql3Var5 = new ql3();
            hp0 hp0Var = ru0Var.f29626b;
            this.f23507t = e;
            this.f23508u = ql3Var5;
            this.f23509v = ql3Var5;
            this.f23511x = (byte) 4;
            objMo6468a = hp0Var.mo6468a(e);
            if (objMo6468a != ap0Var) {
                ql3Var = ql3Var5;
                gp0Var = e;
                ql3Var2 = ql3Var;
            }
            return ap0Var;
        }
    }
}

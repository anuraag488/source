package p000;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import java.lang.invoke.VarHandle;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: k6 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C0824k6 extends of4 implements mq1 {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f22920A;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f22921t = 2;

    /* JADX INFO: renamed from: u */
    public byte f22922u;

    /* JADX INFO: renamed from: v */
    public Object f22923v;

    /* JADX INFO: renamed from: w */
    public boolean f22924w;

    /* JADX INFO: renamed from: x */
    public Object f22925x;

    /* JADX INFO: renamed from: y */
    public Object f22926y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f22927z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824k6(yp1 yp1Var, he0 he0Var, boolean z, dz0 dz0Var, Context context, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22926y = yp1Var;
        this.f22927z = he0Var;
        this.f22924w = z;
        this.f22920A = dz0Var;
        this.f22925x = context;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f22921t;
        Object obj2 = this.f22920A;
        Object obj3 = this.f22927z;
        switch (b) {
            case 0:
                return new C0824k6((C0861l6) obj3, (xn2) obj2, (Context) this.f22925x, wm0Var);
            case 1:
                C0824k6 c0824k6 = new C0824k6((yp1) this.f22926y, (he0) obj3, this.f22924w, (dz0) obj2, (Context) this.f22925x, wm0Var);
                c0824k6.f22923v = obj;
                return c0824k6;
            default:
                return new C0824k6(this.f22923v, wm0Var, (od1) this.f22926y, (yp1) obj3, (sw2) obj2);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22921t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C0824k6) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C0824k6) create((wm0) obj2, (Intent) obj)).invokeSuspend(ju4Var);
            default:
                return ((C0824k6) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:120:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:123:0x0302  */
    /* JADX WARN: Code duplicated, block: B:125:0x0308  */
    /* JADX WARN: Code duplicated, block: B:127:0x031a  */
    /* JADX WARN: Code duplicated, block: B:130:0x0357  */
    /* JADX WARN: Code duplicated, block: B:131:0x035c  */
    /* JADX WARN: Code duplicated, block: B:133:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:134:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:138:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:140:0x03e4 A[PHI: r7
  0x03e4: PHI (r7v13 boolean) = (r7v12 boolean), (r7v14 boolean) binds: [B:122:0x0300, B:139:0x03e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:142:0x03f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:145:0x0408  */
    /* JADX WARN: Code duplicated, block: B:148:0x041a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:149:0x041c  */
    /* JADX WARN: Code duplicated, block: B:151:0x042e  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b8 A[DONT_INVERT, PHI: r5
  0x00b8: PHI (r5v13 boolean) = (r5v8 boolean), (r5v11 boolean), (r5v14 boolean) binds: [B:26:0x00b7, B:24:0x00b3, B:11:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:34:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e2 A[PHI: r5
  0x00e2: PHI (r5v15 boolean) = (r5v13 boolean), (r5v16 boolean) binds: [B:30:0x00c9, B:35:0x00dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:41:0x0100  */
    /* JADX WARN: Code duplicated, block: B:46:0x0113  */
    /* JADX WARN: Code duplicated, block: B:49:0x0122 A[PHI: r1 r5
  0x0122: PHI (r1v19 java.lang.Object) = (r1v17 java.lang.Object), (r1v21 java.lang.Object) binds: [B:47:0x011f, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]
  0x0122: PHI (r5v20 boolean) = (r5v15 boolean), (r5v21 boolean) binds: [B:47:0x011f, B:8:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0141  */
    /* JADX WARN: Code duplicated, block: B:55:0x014a  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x0160  */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x046a, code lost:
    
        if (p000.lb5.m7921b0(r4, r5, r18) == r1) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
    
        if (p000.lb5.m7902J(r11, r12, r18) == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0110, code lost:
    
        if (r7.mo9869b(r18) == r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bc, code lost:
    
        if (r1.m4804c(r18) == r3) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01c7, code lost:
    
        if (r1.m4803b(true, r18) == r3) goto L86;
     */
    @Override // p000.AbstractC0888lx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM7901I;
        Activity activity;
        Object objM3495r;
        boolean zBooleanValue;
        C0861l6 c0861l6;
        boolean z;
        xn2 xn2Var;
        b70 b70Var;
        C0714h6 c0714h6;
        wo5 wo5VarM12345f;
        gu5 gu5Var;
        yg3 yg3Var;
        rr5 rr5Var;
        hu5 hu5Var;
        boolean z2;
        String strM12721a;
        k44 k44Var;
        boolean zM4441a;
        xn2 xn2Var2;
        String strM12721a2;
        k44 k44Var2;
        String strM12721a3;
        k44 k44Var3;
        wp1 wp1Var;
        boolean z3;
        sp1 sp1Var;
        Object objInvoke;
        sw2 sw2Var;
        Boolean bool;
        Boolean bool2;
        qe3 qe3Var;
        Object objMo11771c;
        long jM3238Q;
        Object obj2;
        Boolean boolMo9873f;
        Boolean bool3;
        byte b = 3;
        wm0 wm0Var = null;
        switch (this.f22921t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                byte b2 = this.f22922u;
                byte b3 = 0;
                if (b2 == 0) {
                    k43.m7376J(obj);
                    vt0 vt0VarM10013H = qq2.m10013H(((C0861l6) this.f22927z).f23812a);
                    fj1 fj1Var = new fj1((byte) 2);
                    fj1Var.f19023b = vt0VarM10013H;
                    VarHandle.storeStoreFence();
                    this.f22922u = (byte) 1;
                    objM7901I = lb5.m7901I(fj1Var, this);
                    if (objM7901I != ap0Var) {
                    }
                    return ap0Var;
                }
                if (b2 == 1) {
                    k43.m7376J(obj);
                    objM7901I = obj;
                } else {
                    if (b2 == 2) {
                        Activity activity2 = (Activity) this.f22926y;
                        k43.m7376J(obj);
                        activity = activity2;
                        objM3495r = obj;
                        zBooleanValue = ((Boolean) objM3495r).booleanValue();
                        c0861l6 = (C0861l6) this.f22927z;
                        if (c0861l6.f23813b.m4442b() == 3) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c0861l6.f23814c.setValue(Boolean.valueOf(z));
                        if (!zBooleanValue) {
                            xn2Var = (xn2) this.f22920A;
                            if (xn2Var != null) {
                                strM12721a = xn2Var.m12721a();
                                k44Var = k44.f22883b;
                                if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                                    xn2Var.m12722b(k44Var, strM12721a, "show consent form if required", null);
                                }
                            }
                            xn2 xn2Var3 = (xn2) this.f22920A;
                            this.f22926y = activity;
                            this.f22923v = xn2Var3;
                            this.f22924w = zBooleanValue;
                            this.f22922u = (byte) 3;
                            b70Var = new b70(1, C0006a5.m86x(this));
                            b70Var.m3497u();
                            c0714h6 = new C0714h6();
                            c0714h6.f20403a = xn2Var3;
                            c0714h6.f20404b = b70Var;
                            VarHandle.storeStoreFence();
                            wo5VarM12345f = wo5.m12345f(activity);
                            if (((dc6) ((cr6) wo5VarM12345f.f33573h).mo4146j()).m4441a()) {
                                c0714h6.mo3042a(null);
                            } else {
                                ((Queue) ((fx5) ((cr6) wo5VarM12345f.f33572g).mo4146j()).f19401i.get()).add(Long.valueOf(System.currentTimeMillis()));
                                gu5Var = (gu5) ((cr6) wo5VarM12345f.f33570e).mo4146j();
                                ky5.m7752a();
                                yg3Var = new yg3((byte) 15);
                                yg3Var.f35215b = activity;
                                yg3Var.f35216c = c0714h6;
                                VarHandle.storeStoreFence();
                                rr5Var = new rr5((byte) 1);
                                rr5Var.f29555b = c0714h6;
                                VarHandle.storeStoreFence();
                                gu5Var.getClass();
                                ky5.m7752a();
                                hu5Var = (hu5) gu5Var.f20143c.get();
                                if (hu5Var == null) {
                                    rr5Var.mo4677d(new n56(3, "No available form can be built.").m8537a());
                                } else {
                                    pq3 pq3Var = (pq3) gu5Var.f20141a.mo4146j();
                                    pq3Var.f27897c = hu5Var;
                                    ts5 ts5Var = (ts5) ((rr5) pq3Var.m9621t().f33259b).mo4146j();
                                    ts5Var.f31401n = true;
                                    ts5Var.m11130b(yg3Var, rr5Var);
                                }
                            }
                            if (b70Var.m3495r() != ap0Var) {
                                z2 = zBooleanValue;
                                zBooleanValue = z2;
                                zM4441a = ((C0861l6) this.f22927z).f23813b.m4441a();
                                xn2Var2 = (xn2) this.f22920A;
                                if (zM4441a) {
                                    if (xn2Var2 != null) {
                                        strM12721a2 = xn2Var2.m12721a();
                                        k44Var2 = k44.f22883b;
                                        if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                            xn2Var2.m12722b(k44Var2, strM12721a2, "initialize mobile ads", null);
                                        }
                                    }
                                    String string = ((Context) this.f22925x).getPackageManager().getApplicationInfo(((Context) this.f22925x).getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
                                    pw0 pw0Var = l01.f23664a;
                                    gw0 gw0Var = gw0.f20149b;
                                    C0787j6 c0787j6 = new C0787j6((Context) this.f22925x, string, wm0Var, b3);
                                    this.f22926y = null;
                                    this.f22923v = null;
                                    this.f22924w = zBooleanValue;
                                    this.f22922u = (byte) 5;
                                } else {
                                    if (xn2Var2 != null) {
                                        strM12721a3 = xn2Var2.m12721a();
                                        k44Var3 = k44.f22883b;
                                        if (xn2Var2.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                            xn2Var2.m12722b(k44Var3, strM12721a3, "cannot request ads", null);
                                        }
                                    }
                                    this.f22926y = null;
                                    this.f22923v = null;
                                    this.f22924w = zBooleanValue;
                                    this.f22922u = (byte) 4;
                                    d24.m4306g(this);
                                }
                            }
                            break;
                        } else {
                            zM4441a = ((C0861l6) this.f22927z).f23813b.m4441a();
                            xn2Var2 = (xn2) this.f22920A;
                            if (zM4441a) {
                                if (xn2Var2 != null) {
                                    strM12721a2 = xn2Var2.m12721a();
                                    k44Var2 = k44.f22883b;
                                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                        xn2Var2.m12722b(k44Var2, strM12721a2, "initialize mobile ads", null);
                                    }
                                }
                                String string2 = ((Context) this.f22925x).getPackageManager().getApplicationInfo(((Context) this.f22925x).getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
                                pw0 pw0Var2 = l01.f23664a;
                                gw0 gw0Var2 = gw0.f20149b;
                                C0787j6 c0787j7 = new C0787j6((Context) this.f22925x, string2, wm0Var, b3);
                                this.f22926y = null;
                                this.f22923v = null;
                                this.f22924w = zBooleanValue;
                                this.f22922u = (byte) 5;
                            } else {
                                if (xn2Var2 != null) {
                                    strM12721a3 = xn2Var2.m12721a();
                                    k44Var3 = k44.f22883b;
                                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                        xn2Var2.m12722b(k44Var3, strM12721a3, "cannot request ads", null);
                                    }
                                }
                                this.f22926y = null;
                                this.f22923v = null;
                                this.f22924w = zBooleanValue;
                                this.f22922u = (byte) 4;
                                d24.m4306g(this);
                            }
                            break;
                        }
                        return ap0Var;
                    }
                    if (b2 == 3) {
                        z2 = this.f22924w;
                        k43.m7376J(obj);
                        zBooleanValue = z2;
                        zM4441a = ((C0861l6) this.f22927z).f23813b.m4441a();
                        xn2Var2 = (xn2) this.f22920A;
                        if (zM4441a) {
                            if (xn2Var2 != null) {
                                strM12721a2 = xn2Var2.m12721a();
                                k44Var2 = k44.f22883b;
                                if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                    xn2Var2.m12722b(k44Var2, strM12721a2, "initialize mobile ads", null);
                                }
                            }
                            String string3 = ((Context) this.f22925x).getPackageManager().getApplicationInfo(((Context) this.f22925x).getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
                            pw0 pw0Var3 = l01.f23664a;
                            gw0 gw0Var3 = gw0.f20149b;
                            C0787j6 c0787j8 = new C0787j6((Context) this.f22925x, string3, wm0Var, b3);
                            this.f22926y = null;
                            this.f22923v = null;
                            this.f22924w = zBooleanValue;
                            this.f22922u = (byte) 5;
                            break;
                        } else {
                            if (xn2Var2 != null) {
                                strM12721a3 = xn2Var2.m12721a();
                                k44Var3 = k44.f22883b;
                                if (xn2Var2.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                    xn2Var2.m12722b(k44Var3, strM12721a3, "cannot request ads", null);
                                }
                            }
                            this.f22926y = null;
                            this.f22923v = null;
                            this.f22924w = zBooleanValue;
                            this.f22922u = (byte) 4;
                            d24.m4306g(this);
                        }
                        return ap0Var;
                    }
                    if (b2 == 4) {
                        k43.m7376J(obj);
                        xy4.m12794w();
                        return null;
                    }
                    if (b2 != 5) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
                activity = (Activity) objM7901I;
                xn2 xn2Var4 = (xn2) this.f22920A;
                if (xn2Var4 != null) {
                    String strM12721a4 = xn2Var4.m12721a();
                    k44 k44Var4 = k44.f22883b;
                    if (xn2Var4.f34459a.m8274a().compareTo(k44Var4) <= 0) {
                        xn2Var4.m12722b(k44Var4, strM12721a4, "request consent info", null);
                    }
                }
                C0861l6 c0861l7 = (C0861l6) this.f22927z;
                xn2 xn2Var5 = (xn2) this.f22920A;
                this.f22926y = activity;
                this.f22923v = c0861l7;
                this.f22922u = (byte) 2;
                b70 b70Var2 = new b70(1, C0006a5.m86x(this));
                b70Var2.m3497u();
                dc6 dc6Var = c0861l7.f23813b;
                f70 f70Var = new f70((byte) 2);
                VarHandle.storeStoreFence();
                ar3 ar3Var = new ar3((byte) 7);
                ar3Var.f14813b = b70Var2;
                VarHandle.storeStoreFence();
                z32 z32Var = new z32((byte) 2);
                z32Var.f35738b = xn2Var5;
                z32Var.f35739c = b70Var2;
                VarHandle.storeStoreFence();
                synchronized (dc6Var.f16987d) {
                    dc6Var.f16990g = true;
                    break;
                }
                dc6Var.f16992i = f70Var;
                ((Queue) dc6Var.f16989f.f19398f.get()).add(Long.valueOf(System.currentTimeMillis()));
                wo5 wo5Var = dc6Var.f16985b;
                wo5Var.getClass();
                wb6 wb6Var = new wb6(b);
                wb6Var.f33226d = wo5Var;
                wb6Var.f33225c = activity;
                wb6Var.f33227e = f70Var;
                wb6Var.f33228f = ar3Var;
                wb6Var.f33224b = z32Var;
                VarHandle.storeStoreFence();
                ((Executor) wo5Var.f33568c).execute(wb6Var);
                objM3495r = b70Var2.m3495r();
                if (objM3495r != ap0Var) {
                    zBooleanValue = ((Boolean) objM3495r).booleanValue();
                    c0861l6 = (C0861l6) this.f22927z;
                    if (c0861l6.f23813b.m4442b() == 3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c0861l6.f23814c.setValue(Boolean.valueOf(z));
                    if (!zBooleanValue) {
                        xn2Var = (xn2) this.f22920A;
                        if (xn2Var != null) {
                            strM12721a = xn2Var.m12721a();
                            k44Var = k44.f22883b;
                            if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                                xn2Var.m12722b(k44Var, strM12721a, "show consent form if required", null);
                            }
                        }
                        xn2 xn2Var6 = (xn2) this.f22920A;
                        this.f22926y = activity;
                        this.f22923v = xn2Var6;
                        this.f22924w = zBooleanValue;
                        this.f22922u = (byte) 3;
                        b70Var = new b70(1, C0006a5.m86x(this));
                        b70Var.m3497u();
                        c0714h6 = new C0714h6();
                        c0714h6.f20403a = xn2Var6;
                        c0714h6.f20404b = b70Var;
                        VarHandle.storeStoreFence();
                        wo5VarM12345f = wo5.m12345f(activity);
                        if (((dc6) ((cr6) wo5VarM12345f.f33573h).mo4146j()).m4441a()) {
                            c0714h6.mo3042a(null);
                        } else {
                            ((Queue) ((fx5) ((cr6) wo5VarM12345f.f33572g).mo4146j()).f19401i.get()).add(Long.valueOf(System.currentTimeMillis()));
                            gu5Var = (gu5) ((cr6) wo5VarM12345f.f33570e).mo4146j();
                            ky5.m7752a();
                            yg3Var = new yg3((byte) 15);
                            yg3Var.f35215b = activity;
                            yg3Var.f35216c = c0714h6;
                            VarHandle.storeStoreFence();
                            rr5Var = new rr5((byte) 1);
                            rr5Var.f29555b = c0714h6;
                            VarHandle.storeStoreFence();
                            gu5Var.getClass();
                            ky5.m7752a();
                            hu5Var = (hu5) gu5Var.f20143c.get();
                            if (hu5Var == null) {
                                rr5Var.mo4677d(new n56(3, "No available form can be built.").m8537a());
                            } else {
                                pq3 pq3Var2 = (pq3) gu5Var.f20141a.mo4146j();
                                pq3Var2.f27897c = hu5Var;
                                ts5 ts5Var2 = (ts5) ((rr5) pq3Var2.m9621t().f33259b).mo4146j();
                                ts5Var2.f31401n = true;
                                ts5Var2.m11130b(yg3Var, rr5Var);
                            }
                        }
                        if (b70Var.m3495r() != ap0Var) {
                            z2 = zBooleanValue;
                            zBooleanValue = z2;
                            zM4441a = ((C0861l6) this.f22927z).f23813b.m4441a();
                            xn2Var2 = (xn2) this.f22920A;
                            if (zM4441a) {
                                if (xn2Var2 != null) {
                                    strM12721a2 = xn2Var2.m12721a();
                                    k44Var2 = k44.f22883b;
                                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                        xn2Var2.m12722b(k44Var2, strM12721a2, "initialize mobile ads", null);
                                    }
                                }
                                String string4 = ((Context) this.f22925x).getPackageManager().getApplicationInfo(((Context) this.f22925x).getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
                                pw0 pw0Var4 = l01.f23664a;
                                gw0 gw0Var4 = gw0.f20149b;
                                C0787j6 c0787j9 = new C0787j6((Context) this.f22925x, string4, wm0Var, b3);
                                this.f22926y = null;
                                this.f22923v = null;
                                this.f22924w = zBooleanValue;
                                this.f22922u = (byte) 5;
                            } else {
                                if (xn2Var2 != null) {
                                    strM12721a3 = xn2Var2.m12721a();
                                    k44Var3 = k44.f22883b;
                                    if (xn2Var2.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                        xn2Var2.m12722b(k44Var3, strM12721a3, "cannot request ads", null);
                                    }
                                }
                                this.f22926y = null;
                                this.f22923v = null;
                                this.f22924w = zBooleanValue;
                                this.f22922u = (byte) 4;
                                d24.m4306g(this);
                            }
                        }
                    } else {
                        zM4441a = ((C0861l6) this.f22927z).f23813b.m4441a();
                        xn2Var2 = (xn2) this.f22920A;
                        if (zM4441a) {
                            if (xn2Var2 != null) {
                                strM12721a2 = xn2Var2.m12721a();
                                k44Var2 = k44.f22883b;
                                if (xn2Var2.f34459a.m8274a().compareTo(k44Var2) <= 0) {
                                    xn2Var2.m12722b(k44Var2, strM12721a2, "initialize mobile ads", null);
                                }
                            }
                            String string5 = ((Context) this.f22925x).getPackageManager().getApplicationInfo(((Context) this.f22925x).getPackageName(), 128).metaData.getString("com.google.android.gms.ads.APPLICATION_ID");
                            pw0 pw0Var5 = l01.f23664a;
                            gw0 gw0Var5 = gw0.f20149b;
                            C0787j6 c0787j10 = new C0787j6((Context) this.f22925x, string5, wm0Var, b3);
                            this.f22926y = null;
                            this.f22923v = null;
                            this.f22924w = zBooleanValue;
                            this.f22922u = (byte) 5;
                        } else {
                            if (xn2Var2 != null) {
                                strM12721a3 = xn2Var2.m12721a();
                                k44Var3 = k44.f22883b;
                                if (xn2Var2.f34459a.m8274a().compareTo(k44Var3) <= 0) {
                                    xn2Var2.m12722b(k44Var3, strM12721a3, "cannot request ads", null);
                                }
                            }
                            this.f22926y = null;
                            this.f22923v = null;
                            this.f22924w = zBooleanValue;
                            this.f22922u = (byte) 4;
                            d24.m4306g(this);
                        }
                    }
                    break;
                }
                return ap0Var;
            case 1:
                dz0 dz0Var = (dz0) this.f22920A;
                Intent intent = (Intent) this.f22923v;
                ap0 ap0Var2 = ap0.f14763a;
                byte b4 = this.f22922u;
                if (b4 == 0) {
                    k43.m7376J(obj);
                    yp1 yp1Var = (yp1) this.f22926y;
                    this.f22923v = intent;
                    this.f22922u = (byte) 1;
                    if (yp1Var.invoke(this) != ap0Var2) {
                    }
                    return ap0Var2;
                }
                if (b4 == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b4 != 2 && b4 != 3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                intent.addFlags(268435456);
                ((Context) this.f22925x).startActivity(intent);
                return ju4.f22634a;
                he0 he0Var = (he0) this.f22927z;
                if (he0Var != null && (wp1Var = (wp1) he0Var.f20512c.getValue()) != null) {
                    wp1Var.invoke();
                }
                if (!this.f22924w) {
                    this.f22923v = intent;
                    this.f22922u = (byte) 3;
                } else {
                    this.f22923v = intent;
                    this.f22922u = (byte) 2;
                }
                break;
            default:
                sw2 sw2Var2 = (sw2) this.f22920A;
                od1 od1Var = (od1) this.f22926y;
                ap0 ap0Var3 = ap0.f14763a;
                switch (this.f22922u) {
                    case 0:
                        k43.m7376J(obj);
                        boolean zBooleanValue2 = ((Boolean) this.f22923v).booleanValue();
                        if (od1Var.f26639d.mo9870c() || !z62.m13387o(od1Var.f26639d.mo9873f(), Boolean.FALSE)) {
                            z3 = zBooleanValue2;
                            if (z3) {
                                od1Var.f26640e.setValue(Boolean.FALSE);
                            } else if (((Boolean) sw2Var2.getValue()) == null) {
                                yp1 yp1Var2 = (yp1) this.f22927z;
                                this.f22925x = sw2Var2;
                                this.f22924w = z3;
                                this.f22922u = (byte) 3;
                                objInvoke = yp1Var2.invoke(this);
                                if (objInvoke != ap0Var3) {
                                    sw2Var = sw2Var2;
                                    sw2Var.setValue((Boolean) objInvoke);
                                    bool = (Boolean) sw2Var2.getValue();
                                    bool2 = Boolean.TRUE;
                                    if (z62.m13387o(bool, bool2)) {
                                        qe3Var = od1Var.f26639d;
                                        qe3 qe3Var2 = od1Var.f26639d;
                                        if (z62.m13387o(qe3Var.mo9873f(), bool2) && !qe3Var2.mo9868a()) {
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 4;
                                        } else {
                                            v93 v93Var = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3) || od1Var.f26639d.mo9868a()) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                break;
                            } else {
                                bool = (Boolean) sw2Var2.getValue();
                                bool2 = Boolean.TRUE;
                                if (z62.m13387o(bool, bool2)) {
                                    qe3Var = od1Var.f26639d;
                                    qe3 qe3Var3 = od1Var.f26639d;
                                    if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                        v93 v93Var2 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var2.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var2 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        v93 v93Var3 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var3.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var3 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return ju4.f22634a;
                        }
                        if (((sp1) od1Var.f26638c.invoke()).mo5772b()) {
                            C0898m6 c0898m6 = new C0898m6((byte) 1);
                            c0898m6.f24677b = od1Var;
                            VarHandle.storeStoreFence();
                            vt0 vt0VarM10013H2 = qq2.m10013H(c0898m6);
                            C0969o3 c0969o3 = new C0969o3(2, null, (byte) 3);
                            this.f22924w = zBooleanValue2;
                            this.f22922u = (byte) 1;
                        }
                        z3 = zBooleanValue2;
                        sp1Var = (sp1) od1Var.f26638c.invoke();
                        this.f22924w = z3;
                        this.f22922u = (byte) 2;
                        if (sp1Var.mo5773c(this) != ap0Var3) {
                            if (z3) {
                                od1Var.f26640e.setValue(Boolean.FALSE);
                            } else if (((Boolean) sw2Var2.getValue()) == null) {
                                yp1 yp1Var3 = (yp1) this.f22927z;
                                this.f22925x = sw2Var2;
                                this.f22924w = z3;
                                this.f22922u = (byte) 3;
                                objInvoke = yp1Var3.invoke(this);
                                if (objInvoke != ap0Var3) {
                                    sw2Var = sw2Var2;
                                    sw2Var.setValue((Boolean) objInvoke);
                                    bool = (Boolean) sw2Var2.getValue();
                                    bool2 = Boolean.TRUE;
                                    if (z62.m13387o(bool, bool2)) {
                                        qe3Var = od1Var.f26639d;
                                        qe3 qe3Var4 = od1Var.f26639d;
                                        if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                            v93 v93Var4 = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var4.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var4 = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        } else {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            v93 v93Var5 = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var5.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var5 = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        } else {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                bool = (Boolean) sw2Var2.getValue();
                                bool2 = Boolean.TRUE;
                                if (z62.m13387o(bool, bool2)) {
                                    qe3Var = od1Var.f26639d;
                                    qe3 qe3Var5 = od1Var.f26639d;
                                    if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                        v93 v93Var6 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var6.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var6 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        v93 v93Var7 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var7.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var7 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return ju4.f22634a;
                        }
                        break;
                        return ap0Var3;
                    case 1:
                        z3 = this.f22924w;
                        k43.m7376J(obj);
                        sp1Var = (sp1) od1Var.f26638c.invoke();
                        this.f22924w = z3;
                        this.f22922u = (byte) 2;
                        if (sp1Var.mo5773c(this) != ap0Var3) {
                            if (z3) {
                                od1Var.f26640e.setValue(Boolean.FALSE);
                            } else if (((Boolean) sw2Var2.getValue()) == null) {
                                yp1 yp1Var4 = (yp1) this.f22927z;
                                this.f22925x = sw2Var2;
                                this.f22924w = z3;
                                this.f22922u = (byte) 3;
                                objInvoke = yp1Var4.invoke(this);
                                if (objInvoke != ap0Var3) {
                                    sw2Var = sw2Var2;
                                    sw2Var.setValue((Boolean) objInvoke);
                                    bool = (Boolean) sw2Var2.getValue();
                                    bool2 = Boolean.TRUE;
                                    if (z62.m13387o(bool, bool2)) {
                                        qe3Var = od1Var.f26639d;
                                        qe3 qe3Var6 = od1Var.f26639d;
                                        if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                            v93 v93Var8 = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var8.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var8 = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        } else {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            v93 v93Var9 = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var9.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var9 = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        } else {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                bool = (Boolean) sw2Var2.getValue();
                                bool2 = Boolean.TRUE;
                                if (z62.m13387o(bool, bool2)) {
                                    qe3Var = od1Var.f26639d;
                                    qe3 qe3Var7 = od1Var.f26639d;
                                    if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                        v93 v93Var10 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var10.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var10 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        v93 v93Var11 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var11.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var11 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return ju4.f22634a;
                        }
                        return ap0Var3;
                    case 2:
                        z3 = this.f22924w;
                        k43.m7376J(obj);
                        if (z3) {
                            if (((Boolean) sw2Var2.getValue()) == null) {
                                yp1 yp1Var5 = (yp1) this.f22927z;
                                this.f22925x = sw2Var2;
                                this.f22924w = z3;
                                this.f22922u = (byte) 3;
                                objInvoke = yp1Var5.invoke(this);
                                if (objInvoke != ap0Var3) {
                                    sw2Var = sw2Var2;
                                    sw2Var.setValue((Boolean) objInvoke);
                                    bool = (Boolean) sw2Var2.getValue();
                                    bool2 = Boolean.TRUE;
                                    if (z62.m13387o(bool, bool2)) {
                                        qe3Var = od1Var.f26639d;
                                        qe3 qe3Var8 = od1Var.f26639d;
                                        if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                            v93 v93Var12 = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var12.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var12 = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        } else {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            v93 v93Var13 = od1Var.f26637b;
                                            this.f22925x = null;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 5;
                                            objMo11771c = v93Var13.mo11771c(this);
                                            if (objMo11771c != ap0Var3) {
                                                ((Boolean) objMo11771c).getClass();
                                                r50 r50Var13 = i41.f21117b;
                                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                                this.f22925x = objMo11771c;
                                                this.f22924w = z3;
                                                this.f22922u = (byte) 6;
                                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                    obj2 = objMo11771c;
                                                    if (((Boolean) obj2).booleanValue()) {
                                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                                        bool3 = Boolean.TRUE;
                                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                                            od1Var.f26640e.setValue(bool3);
                                                        } else {
                                                            od1Var.f26640e.setValue(bool3);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                bool = (Boolean) sw2Var2.getValue();
                                bool2 = Boolean.TRUE;
                                if (z62.m13387o(bool, bool2)) {
                                    qe3Var = od1Var.f26639d;
                                    qe3 qe3Var9 = od1Var.f26639d;
                                    if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                        v93 v93Var14 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var14.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var14 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        v93 v93Var15 = od1Var.f26637b;
                                        this.f22925x = null;
                                        this.f22924w = z3;
                                        this.f22922u = (byte) 5;
                                        objMo11771c = v93Var15.mo11771c(this);
                                        if (objMo11771c != ap0Var3) {
                                            ((Boolean) objMo11771c).getClass();
                                            r50 r50Var15 = i41.f21117b;
                                            jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                            this.f22925x = objMo11771c;
                                            this.f22924w = z3;
                                            this.f22922u = (byte) 6;
                                            if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                                obj2 = objMo11771c;
                                                if (((Boolean) obj2).booleanValue()) {
                                                    boolMo9873f = od1Var.f26639d.mo9873f();
                                                    bool3 = Boolean.TRUE;
                                                    if (z62.m13387o(boolMo9873f, bool3)) {
                                                        od1Var.f26640e.setValue(bool3);
                                                    } else {
                                                        od1Var.f26640e.setValue(bool3);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return ap0Var3;
                        }
                        od1Var.f26640e.setValue(Boolean.FALSE);
                        return ju4.f22634a;
                    case 3:
                        boolean z4 = this.f22924w;
                        sw2 sw2Var3 = (sw2) this.f22925x;
                        k43.m7376J(obj);
                        sw2Var = sw2Var3;
                        z3 = z4;
                        objInvoke = obj;
                        sw2Var.setValue((Boolean) objInvoke);
                        bool = (Boolean) sw2Var2.getValue();
                        bool2 = Boolean.TRUE;
                        if (z62.m13387o(bool, bool2)) {
                            qe3Var = od1Var.f26639d;
                            qe3 qe3Var10 = od1Var.f26639d;
                            if (z62.m13387o(qe3Var.mo9873f(), bool2)) {
                                v93 v93Var16 = od1Var.f26637b;
                                this.f22925x = null;
                                this.f22924w = z3;
                                this.f22922u = (byte) 5;
                                objMo11771c = v93Var16.mo11771c(this);
                                if (objMo11771c != ap0Var3) {
                                    ((Boolean) objMo11771c).getClass();
                                    r50 r50Var16 = i41.f21117b;
                                    jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                    this.f22925x = objMo11771c;
                                    this.f22924w = z3;
                                    this.f22922u = (byte) 6;
                                    if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                        obj2 = objMo11771c;
                                        if (((Boolean) obj2).booleanValue()) {
                                            boolMo9873f = od1Var.f26639d.mo9873f();
                                            bool3 = Boolean.TRUE;
                                            if (z62.m13387o(boolMo9873f, bool3)) {
                                                od1Var.f26640e.setValue(bool3);
                                            } else {
                                                od1Var.f26640e.setValue(bool3);
                                            }
                                        }
                                    }
                                }
                                return ap0Var3;
                            }
                            v93 v93Var17 = od1Var.f26637b;
                            this.f22925x = null;
                            this.f22924w = z3;
                            this.f22922u = (byte) 5;
                            objMo11771c = v93Var17.mo11771c(this);
                            if (objMo11771c != ap0Var3) {
                                ((Boolean) objMo11771c).getClass();
                                r50 r50Var17 = i41.f21117b;
                                jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                                this.f22925x = objMo11771c;
                                this.f22924w = z3;
                                this.f22922u = (byte) 6;
                                if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                                    obj2 = objMo11771c;
                                    if (((Boolean) obj2).booleanValue()) {
                                        boolMo9873f = od1Var.f26639d.mo9873f();
                                        bool3 = Boolean.TRUE;
                                        if (z62.m13387o(boolMo9873f, bool3)) {
                                            od1Var.f26640e.setValue(bool3);
                                        } else {
                                            od1Var.f26640e.setValue(bool3);
                                        }
                                    }
                                }
                            }
                            return ap0Var3;
                        }
                        return ju4.f22634a;
                    case 4:
                        k43.m7376J(obj);
                        return ju4.f22634a;
                    case 5:
                        boolean z5 = this.f22924w;
                        k43.m7376J(obj);
                        z3 = z5;
                        objMo11771c = obj;
                        ((Boolean) objMo11771c).getClass();
                        r50 r50Var18 = i41.f21117b;
                        jM3238Q = as4.m3238Q(100, m41.MILLISECONDS);
                        this.f22925x = objMo11771c;
                        this.f22924w = z3;
                        this.f22922u = (byte) 6;
                        if (d24.m4318s(jM3238Q, this) != ap0Var3) {
                            obj2 = objMo11771c;
                            if (((Boolean) obj2).booleanValue()) {
                                boolMo9873f = od1Var.f26639d.mo9873f();
                                bool3 = Boolean.TRUE;
                                if (z62.m13387o(boolMo9873f, bool3)) {
                                    od1Var.f26640e.setValue(bool3);
                                } else {
                                    od1Var.f26640e.setValue(bool3);
                                }
                            }
                            return ju4.f22634a;
                        }
                        return ap0Var3;
                    case 6:
                        obj2 = this.f22925x;
                        k43.m7376J(obj);
                        if (((Boolean) obj2).booleanValue()) {
                            boolMo9873f = od1Var.f26639d.mo9873f();
                            bool3 = Boolean.TRUE;
                            if (z62.m13387o(boolMo9873f, bool3)) {
                                od1Var.f26640e.setValue(bool3);
                            } else {
                                od1Var.f26640e.setValue(bool3);
                            }
                        }
                        return ju4.f22634a;
                    default:
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824k6(C0861l6 c0861l6, xn2 xn2Var, Context context, wm0 wm0Var) {
        super(2, wm0Var);
        this.f22927z = c0861l6;
        this.f22920A = xn2Var;
        this.f22925x = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0824k6(Object obj, wm0 wm0Var, od1 od1Var, yp1 yp1Var, sw2 sw2Var) {
        super(2, wm0Var);
        this.f22923v = obj;
        this.f22926y = od1Var;
        this.f22927z = yp1Var;
        this.f22920A = sw2Var;
    }
}

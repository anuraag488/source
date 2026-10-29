package p000;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.view.InputEvent;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class er2 extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f18414t;

    /* JADX INFO: renamed from: u */
    public boolean f18415u;

    /* JADX INFO: renamed from: v */
    public Object f18416v;

    /* JADX INFO: renamed from: w */
    public Object f18417w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f18418x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er2(wm0 wm0Var, pn0 pn0Var, yp1 yp1Var, wp1 wp1Var) {
        super(2, wm0Var);
        this.f18414t = (byte) 16;
        this.f18416v = pn0Var;
        this.f18417w = yp1Var;
        this.f18418x = wp1Var;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f18414t;
        Object obj2 = this.f18418x;
        switch (b) {
            case 0:
                return new er2((fr2) this.f18416v, (Uri) this.f18417w, (InputEvent) obj2, wm0Var, (byte) 0);
            case 1:
                return new er2((dp4) this.f18416v, (y94) this.f18417w, (xv2) obj2, wm0Var, (byte) 1);
            case 2:
                return new er2((C0910mi) this.f18416v, (zx2) this.f18417w, (b33) obj2, wm0Var, (byte) 2);
            case 3:
                return new er2((C0910mi) this.f18416v, (lu2) this.f18417w, (sw2) obj2, wm0Var, (byte) 3);
            case 4:
                er2 er2Var = new er2(this.f18417w, obj2, wm0Var, (byte) 4);
                er2Var.f18416v = obj;
                return er2Var;
            case 5:
                er2 er2Var2 = new er2(obj2, wm0Var, (byte) 5);
                er2Var2.f18417w = obj;
                return er2Var2;
            case 6:
                er2 er2Var3 = new er2(this.f18417w, obj2, wm0Var, (byte) 6);
                er2Var3.f18416v = obj;
                return er2Var3;
            case 7:
                return new er2((en3) this.f18416v, (sw2) this.f18417w, (sw2) obj2, wm0Var, (byte) 7);
            case 8:
                gk2 gk2Var = (gk2) this.f18417w;
                fk2 fk2Var = fk2.f19054a;
                er2 er2Var4 = new er2(gk2Var, (ut4) obj2, wm0Var);
                er2Var4.f18416v = obj;
                return er2Var4;
            case 9:
                er2 er2Var5 = new er2(this.f18417w, obj2, wm0Var, (byte) 9);
                er2Var5.f18416v = obj;
                return er2Var5;
            case 10:
                return new er2((gr1) this.f18416v, (xn2) this.f18417w, (ac4) obj2, wm0Var, (byte) 10);
            case 11:
                er2 er2Var6 = new er2(this.f18417w, obj2, wm0Var, (byte) 11);
                er2Var6.f18416v = obj;
                return er2Var6;
            case 12:
                er2 er2Var7 = new er2(this.f18417w, obj2, wm0Var, (byte) 12);
                er2Var7.f18416v = obj;
                return er2Var7;
            case 13:
                er2 er2Var8 = new er2(this.f18417w, obj2, wm0Var, (byte) 13);
                er2Var8.f18416v = obj;
                return er2Var8;
            case 14:
                return new er2((ek4) this.f18416v, (df3) this.f18417w, (lc3) obj2, wm0Var, (byte) 14);
            case 15:
                return new er2(obj2, wm0Var, (byte) 15);
            case 16:
                return new er2(wm0Var, (pn0) this.f18416v, (yp1) this.f18417w, (wp1) obj2);
            default:
                return new er2((cu2) this.f18416v, (q25) this.f18417w, (x33) obj2, wm0Var, (byte) 17);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18414t;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                return ((er2) create((wm0) obj2, (mg3) obj)).invokeSuspend(ju4Var);
            case 5:
                return ((er2) create((wm0) obj2, (hw2) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((er2) create((wm0) obj2, (ty3) obj)).invokeSuspend(ju4Var);
            case 12:
                return ((er2) create((wm0) obj2, (tx3) obj)).invokeSuspend(ju4Var);
            case 13:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 15:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 16:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return ((er2) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
        }
    }

    @Override // p000.AbstractC0888lx
    public final Object invokeSuspend(Object obj) throws Throwable {
        float f;
        float f2;
        wp1 nu3Var;
        Throwable th;
        cf0 cf0Var;
        gx2 gx2Var;
        byte b = 7;
        byte b2 = 16;
        byte b3 = 4;
        byte b4 = 0;
        wm0 wm0Var = null;
        switch (this.f18414t) {
            case 0:
                ap0 ap0Var = ap0.f14763a;
                boolean z = this.f18415u;
                if (!z) {
                    k43.m7376J(obj);
                    dr2 dr2Var = ((fr2) this.f18416v).f19235a;
                    Uri uri = (Uri) this.f18417w;
                    InputEvent inputEvent = (InputEvent) this.f18418x;
                    this.f18415u = true;
                    if (dr2Var.m6487f(uri, inputEvent, this) == ap0Var) {
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
            case 1:
                ju4 ju4Var = ju4.f22634a;
                dp4 dp4Var = (dp4) this.f18416v;
                ap0 ap0Var2 = ap0.f14763a;
                boolean z2 = this.f18415u;
                if (!z2) {
                    k43.m7376J(obj);
                    ly2 ly2Var = new ly2(b4);
                    ly2Var.f24465b = dp4Var;
                    VarHandle.storeStoreFence();
                    vt0 vt0VarM10013H = qq2.m10013H(ly2Var);
                    y94 y94Var = (y94) this.f18417w;
                    xv2 xv2Var = (xv2) this.f18418x;
                    C0012ab c0012ab = new C0012ab(b3);
                    c0012ab.f226b = dp4Var;
                    c0012ab.f227c = y94Var;
                    c0012ab.f228d = xv2Var;
                    VarHandle.storeStoreFence();
                    this.f18415u = true;
                    C0806jp c0806jp = new C0806jp(b3);
                    c0806jp.f22476b = c0012ab;
                    VarHandle.storeStoreFence();
                    Object objCollect = vt0VarM10013H.collect(c0806jp, this);
                    if (objCollect != ap0Var2) {
                        objCollect = ju4Var;
                    }
                    if (objCollect == ap0Var2) {
                        return ap0Var2;
                    }
                } else {
                    if (!z2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4Var;
            case 2:
                ap0 ap0Var3 = ap0.f14763a;
                boolean z3 = this.f18415u;
                if (!z3) {
                    k43.m7376J(obj);
                    C0910mi c0910mi = (C0910mi) this.f18416v;
                    yx2 yx2Var = ((zx2) this.f18417w).f36443a;
                    yx2 yx2Var2 = yx2.f35586c;
                    b33 b33Var = (b33) this.f18418x;
                    Float f3 = new Float(yx2Var == yx2Var2 ? Float.intBitsToFloat((int) (b33Var.f15059a >> 32)) : Float.intBitsToFloat((int) (4294967295L & b33Var.f15059a)));
                    db4 db4VarM10014I = qq2.m10014I(0.45f, 400.0f, null, 4);
                    this.f18415u = true;
                    if (C0910mi.m8325a(c0910mi, f3, db4VarM10014I, null, this, 12) == ap0Var3) {
                        return ap0Var3;
                    }
                } else {
                    if (!z3) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 3:
                ap0 ap0Var4 = ap0.f14763a;
                boolean z4 = this.f18415u;
                if (!z4) {
                    k43.m7376J(obj);
                    C0910mi c0910mi2 = (C0910mi) this.f18416v;
                    fs1 fs1Var = (fs1) ((sw2) this.f18418x).getValue();
                    if (fs1Var instanceof cs1) {
                        f2 = 0.0f;
                    } else {
                        if (fs1Var instanceof ds1) {
                            f = ((ds1) fs1Var).f17331a;
                        } else {
                            if (!(fs1Var instanceof es1)) {
                                C0670g.m5864c();
                                return null;
                            }
                            f = ((es1) fs1Var).f18430a;
                        }
                        f2 = 1.0f - f;
                    }
                    Float f4 = new Float(f2);
                    db4 db4VarMo7286c = ((lu2) this.f18417w).mo7286c();
                    this.f18415u = true;
                    if (C0910mi.m8325a(c0910mi2, f4, db4VarMo7286c, null, this, 12) == ap0Var4) {
                        return ap0Var4;
                    }
                } else {
                    if (!z4) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 4:
                ap0 ap0Var5 = ap0.f14763a;
                boolean z5 = this.f18415u;
                if (!z5) {
                    k43.m7376J(obj);
                    mg3 mg3Var = (mg3) this.f18416v;
                    NetworkRequest networkRequestM7163a = ((jl0) this.f18417w).m7163a();
                    byte b5 = 18;
                    byte b6 = 13;
                    byte b7 = 3;
                    if (networkRequestM7163a == null) {
                        s03 s03Var = ((jl0) this.f18417w).f22382a;
                        if (s03Var == s03.f29788a) {
                            networkRequestM7163a = null;
                        } else {
                            NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                            if (s03Var == s03.f29793f) {
                                networkRequestM7163a = builderRemoveCapability.addCapability(25).build();
                            } else {
                                int iOrdinal = s03Var.ordinal();
                                if (iOrdinal == 2) {
                                    builderRemoveCapability = builderRemoveCapability.addCapability(11);
                                } else if (iOrdinal == 3) {
                                    builderRemoveCapability = builderRemoveCapability.addCapability(18);
                                } else if (iOrdinal == 4) {
                                    builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                                }
                                networkRequestM7163a = builderRemoveCapability.build();
                            }
                        }
                    }
                    if (networkRequestM7163a == null) {
                        mg3Var.getClass();
                        mg3Var.f24885e.m5486f(null, false);
                        return ju4.f22634a;
                    }
                    t82 t82VarM7910S = lb5.m7910S(mg3Var, null, null, new it1((q03) this.f18418x, mg3Var, wm0Var, b6), 3);
                    na1 na1Var = new na1(b2);
                    na1Var.f25595b = t82VarM7910S;
                    na1Var.f25596c = mg3Var;
                    VarHandle.storeStoreFence();
                    c54 c54Var = c54.f15812a;
                    ConnectivityManager connectivityManager = ((q03) this.f18418x).f28126a;
                    c54Var.getClass();
                    synchronized (c54.f15813b) {
                        LinkedHashMap linkedHashMap = c54.f15814c;
                        if (linkedHashMap.isEmpty()) {
                            wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController register shared callback");
                            try {
                                connectivityManager.registerDefaultNetworkCallback(c54Var);
                            } catch (SecurityException e) {
                                wn2.m12326e().m12330d(w15.f33035a, "NetworkRequestConstraintController couldn't register callback", e);
                                na1Var.invoke(new pl0(7));
                                nu3Var = new nu3((byte) 9);
                            }
                        } else if (c54.f15816e && c54.f15817f != null) {
                            wn2.m12326e().m12328b(w15.f33035a, "NetworkRequestConstraintController send initial capabilities");
                            NetworkCapabilities networkCapabilities = c54.f15815d;
                            if (!c54.f15817f.booleanValue() && networkRequestM7163a.canBeSatisfiedBy(networkCapabilities)) {
                                b4 = 1;
                            }
                            na1Var.invoke(b4 != 0 ? ol0.f26840a : new pl0(7));
                        }
                        break;
                    }
                    jp1 jp1Var = new jp1(b5);
                    jp1Var.f22485b = na1Var;
                    jp1Var.f22486c = connectivityManager;
                    VarHandle.storeStoreFence();
                    nu3Var = jp1Var;
                    n10 n10Var = new n10(b7);
                    n10Var.f25376b = nu3Var;
                    VarHandle.storeStoreFence();
                    this.f18415u = true;
                    if (lb5.m7938s(mg3Var, n10Var, this) == ap0Var5) {
                        return ap0Var5;
                    }
                } else {
                    if (!z5) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 5:
                hw2 hw2Var = (hw2) this.f18417w;
                ap0 ap0Var6 = ap0.f14763a;
                boolean z6 = this.f18415u;
                if (z6) {
                    if (!z6) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hw2 hw2Var2 = (hw2) this.f18416v;
                    k43.m7376J(obj);
                    return hw2Var2;
                }
                k43.m7376J(obj);
                hw2 hw2Var3 = new hw2(new LinkedHashMap(hw2Var.m6523a()), false);
                mq1 mq1Var = (mq1) this.f18418x;
                this.f18417w = null;
                this.f18416v = hw2Var3;
                this.f18415u = true;
                return mq1Var.invoke(hw2Var3, this) == ap0Var6 ? ap0Var6 : hw2Var3;
            case 6:
                ap0 ap0Var7 = ap0.f14763a;
                boolean z7 = this.f18415u;
                if (z7) {
                    if (z7) {
                        k43.m7376J(obj);
                        return ju4.f22634a;
                    }
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                k43.m7376J(obj);
                zo0 zo0Var = (zo0) this.f18416v;
                dl3 dl3Var = (dl3) this.f18417w;
                vt2 vt2Var = (vt2) this.f18418x;
                this.f18415u = true;
                dl3Var.invoke(zo0Var, vt2Var, this);
                return ap0Var7;
            case 7:
                sw2 sw2Var = (sw2) this.f18418x;
                en3 en3Var = (en3) this.f18416v;
                ap0 ap0Var8 = ap0.f14763a;
                boolean z8 = this.f18415u;
                if (!z8) {
                    k43.m7376J(obj);
                    long jM3429g = b33.m3429g(((b33) ((sw2) this.f18417w).getValue()).f15059a, ((b33) en3Var.f18274c.invoke()).f15059a);
                    long jM6580e = i20.m6580e((((int) (((w52) sw2Var.getValue()).f33109a >> 32)) / 2.0f) + b33.m3427e(jM3429g), (((int) (((w52) sw2Var.getValue()).f33109a & 4294967295L)) / 2.0f) + b33.m3428f(jM3429g));
                    rn3 rn3Var = en3Var.f18272a;
                    Object obj2 = en3Var.f18273b;
                    this.f18415u = true;
                    if (rn3Var.m10380g(obj2, jM6580e, this) == ap0Var8) {
                        return ap0Var8;
                    }
                } else {
                    if (!z8) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 8:
                ap0 ap0Var9 = ap0.f14763a;
                boolean z9 = this.f18415u;
                if (!z9) {
                    k43.m7376J(obj);
                    zo0 zo0Var2 = (zo0) this.f18416v;
                    pw0 pw0Var = l01.f23664a;
                    yu1 yu1Var = mp2.f25111a.f35531e;
                    gk2 gk2Var = (gk2) this.f18417w;
                    fk2 fk2Var = fk2.f19054a;
                    C0934n5 c0934n5 = new C0934n5(gk2Var, zo0Var2, (ut4) this.f18418x, null);
                    this.f18415u = true;
                    if (lb5.m7921b0(yu1Var, c0934n5, this) == ap0Var9) {
                        return ap0Var9;
                    }
                } else {
                    if (!z9) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 9:
                ap0 ap0Var10 = ap0.f14763a;
                boolean z10 = this.f18415u;
                if (z10) {
                    if (!z10) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    cf0Var = (cf0) this.f18416v;
                    try {
                        k43.m7376J(obj);
                    } catch (Throwable th2) {
                        th = th2;
                        obj = k43.m7389n(th);
                    }
                    break;
                } else {
                    k43.m7376J(obj);
                    zo0 zo0Var3 = (zo0) this.f18416v;
                    cf0 cf0Var2 = (cf0) this.f18417w;
                    mq1 mq1Var2 = (mq1) this.f18418x;
                    try {
                        this.f18416v = cf0Var2;
                        this.f18415u = true;
                        obj = mq1Var2.invoke(zo0Var3, this);
                        if (obj == ap0Var10) {
                            return ap0Var10;
                        }
                        cf0Var = cf0Var2;
                    } catch (Throwable th3) {
                        th = th3;
                        cf0Var = cf0Var2;
                        obj = k43.m7389n(th);
                    }
                }
                Throwable thM4638b = dp3.m4638b(obj);
                if (thM4638b == null) {
                    cf0Var.m4989U(obj);
                } else {
                    cf0Var.getClass();
                    cf0Var.m4989U(new ff0(thM4638b, false));
                }
                return ju4.f22634a;
            case 10:
                ap0 ap0Var11 = ap0.f14763a;
                boolean z11 = this.f18415u;
                if (!z11) {
                    k43.m7376J(obj);
                    gr1 gr1Var = (gr1) this.f18416v;
                    xn2 xn2Var = (xn2) this.f18417w;
                    ac4 ac4Var = (ac4) this.f18418x;
                    up4 up4Var = new up4(b);
                    up4Var.f32065b = xn2Var;
                    up4Var.f32066c = ac4Var;
                    VarHandle.storeStoreFence();
                    pg0 pg0Var = new pg0(-1813141352, true, up4Var);
                    this.f18415u = true;
                    if (lb5.m7921b0(gr1Var.mo5182k().minusKey(o85.f26448h), new C0671g0(gr1Var, pg0Var, wm0Var, b2), this) == ap0Var11) {
                        return ap0Var11;
                    }
                } else {
                    if (!z11) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 11:
                ap0 ap0Var12 = ap0.f14763a;
                boolean z12 = this.f18415u;
                if (!z12) {
                    k43.m7376J(obj);
                    ty3 ty3Var = (ty3) this.f18416v;
                    C1031pe c1031pe = (C1031pe) this.f18417w;
                    vy3 vy3Var = (vy3) this.f18418x;
                    na1 na1Var2 = new na1((byte) 29);
                    na1Var2.f25595b = ty3Var;
                    na1Var2.f25596c = vy3Var;
                    VarHandle.storeStoreFence();
                    this.f18415u = true;
                    if (c1031pe.invoke(na1Var2, this) == ap0Var12) {
                        return ap0Var12;
                    }
                } else {
                    if (!z12) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 12:
                ap0 ap0Var13 = ap0.f14763a;
                boolean z13 = this.f18415u;
                if (!z13) {
                    k43.m7376J(obj);
                    tx3 tx3Var = (tx3) this.f18416v;
                    vy3 vy3Var2 = (vy3) this.f18417w;
                    vy3Var2.f32968k = tx3Var;
                    mq1 mq1Var3 = (mq1) this.f18418x;
                    ty3 ty3Var2 = vy3Var2.f32969l;
                    this.f18415u = true;
                    if (mq1Var3.invoke(ty3Var2, this) == ap0Var13) {
                        return ap0Var13;
                    }
                } else {
                    if (!z13) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 13:
                ap0 ap0Var14 = ap0.f14763a;
                boolean z14 = this.f18415u;
                if (!z14) {
                    k43.m7376J(obj);
                    zo0 zo0Var4 = (zo0) this.f18416v;
                    xb4 xb4Var = (xb4) this.f18417w;
                    by2 by2Var = new by2((byte) 2);
                    by2Var.f15683b = xb4Var;
                    VarHandle.storeStoreFence();
                    vt0 vt0VarM10013H2 = qq2.m10013H(by2Var);
                    C0910mi c0910mi3 = (C0910mi) this.f18418x;
                    fa1 fa1Var = new fa1((byte) 5);
                    fa1Var.f18877b = c0910mi3;
                    fa1Var.f18878c = zo0Var4;
                    VarHandle.storeStoreFence();
                    this.f18415u = true;
                    if (vt0VarM10013H2.collect(fa1Var, this) == ap0Var14) {
                        return ap0Var14;
                    }
                } else {
                    if (!z14) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 14:
                ap0 ap0Var15 = ap0.f14763a;
                boolean z15 = this.f18415u;
                if (!z15) {
                    k43.m7376J(obj);
                    ek4 ek4Var = (ek4) this.f18416v;
                    df3 df3Var = (df3) this.f18417w;
                    b33 b33VarM3423a = b33.m3423a(((lc3) this.f18418x).f23937c);
                    this.f18415u = true;
                    if (ek4Var.invoke(df3Var, b33VarM3423a, this) == ap0Var15) {
                        return ap0Var15;
                    }
                } else {
                    if (!z15) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            case 15:
                zh0 zh0Var = (zh0) this.f18418x;
                ap0 ap0Var16 = ap0.f14763a;
                boolean z16 = this.f18415u;
                if (!z16) {
                    k43.m7376J(obj);
                    yz3 yz3Var = (yz3) zh0Var;
                    aa4 aa4Var = yz3Var.f35657l;
                    if (aa4Var != null) {
                        aa4Var.m159e(yz3Var, zp0.f36244g, yz3Var.f35656k);
                    }
                    gx2 gx2Var2 = yz3Var.f35660o;
                    this.f18416v = gx2Var2;
                    this.f18417w = zh0Var;
                    this.f18415u = true;
                    if (gx2Var2.m6191e(this) == ap0Var16) {
                        return ap0Var16;
                    }
                    gx2Var = gx2Var2;
                } else {
                    if (!z16) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zh0Var = (zh0) this.f18417w;
                    gx2Var = (gx2) this.f18416v;
                    k43.m7376J(obj);
                }
                try {
                    ((yz3) zh0Var).f35653h = ((yz3) zh0Var).f35651f.getValue();
                    b70 b70Var = ((yz3) zh0Var).f35659n;
                    if (b70Var != null) {
                        b70Var.resumeWith(((yz3) zh0Var).f35651f.getValue());
                    }
                    ((yz3) zh0Var).f35659n = null;
                    return ju4.f22634a;
                } finally {
                    gx2Var.m6193g(null);
                }
            case 16:
                ap0 ap0Var17 = ap0.f14763a;
                boolean z17 = this.f18415u;
                if (!z17) {
                    k43.m7376J(obj);
                    yp1 yp1VarMo6046b = ((pn0) this.f18416v).mo6046b();
                    if (yp1VarMo6046b != null) {
                        this.f18415u = true;
                        if (yp1VarMo6046b.invoke(this) == ap0Var17) {
                            return ap0Var17;
                        }
                    }
                } else {
                    if (!z17) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                ((yp1) this.f18417w).invoke(null);
                ((wp1) this.f18418x).invoke();
                return ju4.f22634a;
            default:
                q25 q25Var = (q25) this.f18417w;
                ap0 ap0Var18 = ap0.f14763a;
                boolean z18 = this.f18415u;
                if (!z18) {
                    k43.m7376J(obj);
                    ArrayList arrayList = ((cu2) this.f18416v).f16495a;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj3 = arrayList.get(i);
                        i++;
                        if (((gl0) obj3).mo3762a(q25Var)) {
                            arrayList2.add(obj3);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(ib0.m6717y0(arrayList2, 10));
                    int size2 = arrayList2.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj4 = arrayList2.get(i2);
                        i2++;
                        arrayList3.add(((gl0) obj4).mo3763b(q25Var.f28171j));
                    }
                    si1[] si1VarArr = (si1[]) hb0.m6319e1(arrayList3).toArray(new si1[0]);
                    vt0 vt0Var = new vt0(b3);
                    vt0Var.f32851b = si1VarArr;
                    VarHandle.storeStoreFence();
                    si1 si1VarM13840D = zy5.m13840D(vt0Var);
                    x33 x33Var = (x33) this.f18418x;
                    fa1 fa1Var2 = new fa1((byte) 8);
                    fa1Var2.f18877b = x33Var;
                    fa1Var2.f18878c = q25Var;
                    VarHandle.storeStoreFence();
                    this.f18415u = true;
                    if (si1VarM13840D.collect(fa1Var2, this) == ap0Var18) {
                        return ap0Var18;
                    }
                } else {
                    if (!z18) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public er2(gk2 gk2Var, ut4 ut4Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f18414t = (byte) 8;
        fk2 fk2Var = fk2.f19054a;
        this.f18417w = gk2Var;
        this.f18418x = ut4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er2(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f18414t = b;
        this.f18418x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er2(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f18414t = b;
        this.f18417w = obj;
        this.f18418x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ er2(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f18414t = b;
        this.f18416v = obj;
        this.f18417w = obj2;
        this.f18418x = obj3;
    }
}

package p000;

import ads_mobile_sdk.AbstractC0137h;
import ads_mobile_sdk.C0032ar;
import ads_mobile_sdk.C0045ba;
import ads_mobile_sdk.C0052br;
import ads_mobile_sdk.C0055bw;
import ads_mobile_sdk.C0152hw;
import ads_mobile_sdk.C0213l2;
import ads_mobile_sdk.C0217lc;
import ads_mobile_sdk.C0413y3;
import ads_mobile_sdk.EnumC0139h2;
import ads_mobile_sdk.aq1;
import ads_mobile_sdk.at1;
import ads_mobile_sdk.b11;
import ads_mobile_sdk.cy3;
import ads_mobile_sdk.d63;
import ads_mobile_sdk.dd3;
import ads_mobile_sdk.e33;
import ads_mobile_sdk.e62;
import ads_mobile_sdk.ff3;
import ads_mobile_sdk.fy3;
import ads_mobile_sdk.g03;
import ads_mobile_sdk.gx0;
import ads_mobile_sdk.h50;
import ads_mobile_sdk.h51;
import ads_mobile_sdk.i11;
import ads_mobile_sdk.i51;
import ads_mobile_sdk.j11;
import ads_mobile_sdk.j31;
import ads_mobile_sdk.ki2;
import ads_mobile_sdk.kx2;
import ads_mobile_sdk.m11;
import ads_mobile_sdk.mc0;
import ads_mobile_sdk.mk2;
import ads_mobile_sdk.mx3;
import ads_mobile_sdk.nh1;
import ads_mobile_sdk.pm1;
import ads_mobile_sdk.q11;
import ads_mobile_sdk.ri2;
import ads_mobile_sdk.s21;
import ads_mobile_sdk.s41;
import ads_mobile_sdk.si2;
import ads_mobile_sdk.su1;
import ads_mobile_sdk.sw0;
import ads_mobile_sdk.sy3;
import ads_mobile_sdk.t54;
import ads_mobile_sdk.tc0;
import ads_mobile_sdk.w01;
import ads_mobile_sdk.w11;
import ads_mobile_sdk.xa3;
import ads_mobile_sdk.yb1;
import ads_mobile_sdk.yg2;
import ads_mobile_sdk.yv0;
import ads_mobile_sdk.yx0;
import ads_mobile_sdk.zf2;
import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import androidx.work.Worker;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: ty */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1199ty extends of4 implements mq1 {

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ byte f31519t;

    /* JADX INFO: renamed from: u */
    public byte f31520u;

    /* JADX INFO: renamed from: v */
    public Object f31521v;

    /* JADX INFO: renamed from: w */
    public Object f31522w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f31523x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199ty(Uri uri, WebResourceRequest webResourceRequest, h51 h51Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31519t = (byte) 13;
        this.f31521v = uri;
        this.f31522w = h51Var;
        this.f31523x = webResourceRequest;
    }

    /* JADX WARN: Code duplicated, block: B:87:0x018e A[Catch: all -> 0x00e3, TryCatch #4 {all -> 0x00e3, blocks: (B:96:0x01ae, B:90:0x019b, B:92:0x019f, B:47:0x00ce, B:49:0x00d7, B:55:0x00e7, B:56:0x00eb, B:71:0x0136, B:72:0x0142, B:73:0x014e, B:75:0x015f, B:76:0x0163, B:77:0x016f, B:84:0x0183, B:83:0x017d, B:87:0x018e, B:59:0x0103, B:61:0x0116, B:62:0x011e, B:44:0x00c2, B:79:0x0175), top: B:120:0x00c2, inners: #8, #10 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x019a  */
    /* JADX WARN: Code duplicated, block: B:90:0x019b A[Catch: all -> 0x00e3, PHI: r0 r10
  0x019b: PHI (r0v24 java.lang.Object) = (r0v9 java.lang.Object), (r0v40 java.lang.Object) binds: [B:21:0x004d, B:88:0x0198] A[DONT_GENERATE, DONT_INLINE]
  0x019b: PHI (r10v3 ads_mobile_sdk.sw0) = (r10v1 ads_mobile_sdk.sw0), (r10v5 ads_mobile_sdk.sw0) binds: [B:21:0x004d, B:88:0x0198] A[DONT_GENERATE, DONT_INLINE], TryCatch #4 {all -> 0x00e3, blocks: (B:96:0x01ae, B:90:0x019b, B:92:0x019f, B:47:0x00ce, B:49:0x00d7, B:55:0x00e7, B:56:0x00eb, B:71:0x0136, B:72:0x0142, B:73:0x014e, B:75:0x015f, B:76:0x0163, B:77:0x016f, B:84:0x0183, B:83:0x017d, B:87:0x018e, B:59:0x0103, B:61:0x0116, B:62:0x011e, B:44:0x00c2, B:79:0x0175), top: B:120:0x00c2, inners: #8, #10 }] */
    /* JADX WARN: Code duplicated, block: B:92:0x019f A[Catch: all -> 0x00e3, TryCatch #4 {all -> 0x00e3, blocks: (B:96:0x01ae, B:90:0x019b, B:92:0x019f, B:47:0x00ce, B:49:0x00d7, B:55:0x00e7, B:56:0x00eb, B:71:0x0136, B:72:0x0142, B:73:0x014e, B:75:0x015f, B:76:0x0163, B:77:0x016f, B:84:0x0183, B:83:0x017d, B:87:0x018e, B:59:0x0103, B:61:0x0116, B:62:0x011e, B:44:0x00c2, B:79:0x0175), top: B:120:0x00c2, inners: #8, #10 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01ac  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        if (r5.m1091b(r18) == r6) goto L101;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$ads_mobile_sdk$cr(Object obj) throws Throwable {
        byte b;
        ActivityManager activityManager;
        Object objM1088b;
        sw0 sw0Var;
        Object objM1087a;
        sw0 sw0Var2;
        byte b2;
        mc0 mc0Var;
        tc0 tc0Var;
        wa2 wa2Var;
        zo0 zo0Var = (zo0) this.f31523x;
        yx0 yx0Var = (yx0) this.f31522w;
        Context context = yx0Var.f13893b;
        AtomicBoolean atomicBoolean = yx0Var.f13898g;
        gx0 gx0Var = yx0Var.f13894c;
        ap0 ap0Var = ap0.f14763a;
        byte b3 = this.f31520u;
        byte b4 = 2;
        ju4 ju4Var = ju4.f22634a;
        boolean z = true;
        boolean z2 = true;
        wm0 wm0Var = null;
        try {
            if (b3 == 0) {
                k43.m7376J(obj);
                if (yx0Var.f13899h.getAndSet(true)) {
                    return ju4Var;
                }
                activityManager = (ActivityManager) context.getSystemService(ActivityManager.class);
                try {
                    ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) hb0.m6301M0(activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 1));
                    if (applicationExitInfo != null) {
                        b = 5;
                        try {
                            cy3.m653a().mo1538e().f5862Q = applicationExitInfo.getReason();
                            cy3.m653a().mo1538e().f5863R = applicationExitInfo.getStatus();
                        } catch (Throwable th) {
                            th = th;
                            sy3.m2304a(4, "Failed to get previous app exit reason, flags may still be loaded.", th);
                        }
                    } else {
                        b = 5;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    b = 5;
                }
                sy3.m2303a(zo0Var, (t82) null, new C0032ar(yx0Var, wm0Var, z2 ? 1 : 0), 3);
                try {
                    this.f31521v = activityManager;
                    this.f31520u = (byte) 1;
                    objM1088b = gx0.m1088b(gx0Var, this);
                    if (objM1088b == ap0Var) {
                    }
                } catch (Throwable th3) {
                    th = th3;
                    mx3 mx3VarM653a = cy3.m653a();
                    mx3VarM653a.mo1538e().f5878m = false;
                    mx3VarM653a.m1735a(th);
                    yx0Var.f13901j = new wa2();
                    this.f31521v = null;
                    this.f31520u = b;
                }
                return ap0Var;
            }
            try {
                if (b3 == 1) {
                    ActivityManager activityManager2 = (ActivityManager) this.f31521v;
                    k43.m7376J(obj);
                    activityManager = activityManager2;
                    b = 5;
                    objM1088b = obj;
                } else if (b3 != 2) {
                    if (b3 == 3) {
                        sw0 sw0Var3 = (sw0) this.f31521v;
                        k43.m7376J(obj);
                        sw0Var = sw0Var3;
                        objM1087a = obj;
                        mc0Var = (mc0) objM1087a;
                        if (mc0Var != null) {
                            tc0Var = yx0Var.f13895d;
                            this.f31521v = sw0Var;
                            this.f31520u = (byte) 4;
                            if (tc0.m2322a(tc0Var, mc0Var, this) == ap0Var) {
                                return ap0Var;
                            }
                        }
                        sw0Var2 = sw0Var;
                    } else {
                        if (b3 != 4) {
                            if (b3 != 5) {
                                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            try {
                                k43.m7376J(obj);
                                b2 = 0;
                                yx0Var.f13906o.set(false);
                                atomicBoolean.set(true);
                                sy3.m2303a(zo0Var, (t82) null, new C0052br(yx0Var, wm0Var, b2), 3);
                                return ju4Var;
                            } catch (Throwable th4) {
                                th = th4;
                                atomicBoolean.set(z);
                                throw th;
                            }
                        }
                        sw0Var2 = (sw0) this.f31521v;
                        k43.m7376J(obj);
                    }
                    yx0Var.f13902k.set(sw0Var2.m2293w());
                    sy3.m2303a(zo0Var, (t82) null, new C0032ar(yx0Var, wm0Var, (byte) 0), 3);
                } else {
                    k43.m7376J(obj);
                }
                b2 = 0;
            } catch (Throwable th5) {
                th = th5;
                b = 5;
                try {
                    mx3 mx3VarM653a2 = cy3.m653a();
                    mx3VarM653a2.mo1538e().f5878m = false;
                    mx3VarM653a2.m1735a(th);
                    yx0Var.f13901j = new wa2();
                    this.f31521v = null;
                    this.f31520u = b;
                } catch (Throwable th6) {
                    th = th6;
                    z = true;
                    atomicBoolean.set(z);
                    throw th;
                }
            }
            atomicBoolean.set(true);
            sy3.m2303a(zo0Var, (t82) null, new C0052br(yx0Var, wm0Var, b2), 3);
            return ju4Var;
            wa2Var = (wa2) new ou1().m9270c(sw0Var.m2294y(), new cs4(wa2.class));
        } catch (Exception e) {
            mx3 mx3VarM653a3 = cy3.m653a();
            mx3VarM653a3.m1735a(e);
            ArrayList arrayList = mx3VarM653a3.mo1538e().f5884s;
            String message = e.getMessage();
            if (message == null) {
                message = e.getClass().getName();
            }
            arrayList.add(message);
            wa2Var = null;
        }
        sw0Var = (sw0) objM1088b;
        yx0Var.f13909r = !sw0Var.m2295z() && hd4.m6345k0(sw0Var.m2294y());
        su1 su1Var = su1.f11748a;
        if (wa2Var != null) {
            yx0Var.f13907p = true;
            int iM2287A = sw0Var.m2287A();
            Integer numValueOf = Integer.valueOf(b);
            try {
                numValueOf = Integer.valueOf(wa2Var.m12186z("gads:max_sessions_before_flag_reset").mo3526e());
            } catch (Exception unused) {
            }
            if (iM2287A < Math.max(1, Math.min(numValueOf.intValue(), 10))) {
                yx0Var.f13901j = wa2Var;
                this.f31521v = sw0Var;
                this.f31520u = (byte) 3;
                objM1087a = gx0.m1087a(gx0Var, this);
                if (objM1087a == ap0Var) {
                    mc0Var = (mc0) objM1087a;
                    if (mc0Var != null) {
                        tc0Var = yx0Var.f13895d;
                        this.f31521v = sw0Var;
                        this.f31520u = (byte) 4;
                        if (tc0.m2322a(tc0Var, mc0Var, this) == ap0Var) {
                        }
                    }
                    sw0Var2 = sw0Var;
                    yx0Var.f13902k.set(sw0Var2.m2293w());
                    sy3.m2303a(zo0Var, (t82) null, new C0032ar(yx0Var, wm0Var, (byte) 0), 3);
                }
                return ap0Var;
            }
            Boolean boolValueOf = Boolean.TRUE;
            try {
                boolValueOf = Boolean.valueOf(wa2Var.m12186z("gads:use_previous_exit_reasons_for_crash_loop_detection").mo3523b());
            } catch (Exception unused2) {
            }
            if (boolValueOf.booleanValue()) {
                try {
                    if (!yx0.m2769a(yx0Var, activityManager, wa2Var)) {
                        yx0Var.f13901j = wa2Var;
                        this.f31521v = sw0Var;
                        this.f31520u = (byte) 3;
                        objM1087a = gx0.m1087a(gx0Var, this);
                        if (objM1087a == ap0Var) {
                            mc0Var = (mc0) objM1087a;
                            if (mc0Var != null) {
                                tc0Var = yx0Var.f13895d;
                                this.f31521v = sw0Var;
                                this.f31520u = (byte) 4;
                                if (tc0.m2322a(tc0Var, mc0Var, this) == ap0Var) {
                                }
                            }
                            sw0Var2 = sw0Var;
                            yx0Var.f13902k.set(sw0Var2.m2293w());
                            sy3.m2303a(zo0Var, (t82) null, new C0032ar(yx0Var, wm0Var, (byte) 0), 3);
                        }
                    }
                } catch (Throwable th7) {
                    sy3.m2304a(4, "Failed to get previous app exit reasons, flags will be reset.", th7);
                }
                return ap0Var;
            }
            this.f31521v = null;
            this.f31520u = (byte) 2;
            if (yx0.m2768a(yx0Var, this) == ap0Var) {
                return ap0Var;
            }
            b2 = 0;
            atomicBoolean.set(true);
            sy3.m2303a(zo0Var, (t82) null, new C0052br(yx0Var, wm0Var, b2), 3);
            return ju4Var;
        }
        try {
            sy3.m2303a(zo0Var, (t82) null, new C0032ar(yx0Var, wm0Var, b4), 3);
            atomicBoolean.set(true);
            return ju4Var;
        } catch (Throwable th8) {
            th = th8;
            mx3 mx3VarM653a4 = cy3.m653a();
            mx3VarM653a4.mo1538e().f5878m = false;
            mx3VarM653a4.m1735a(th);
            yx0Var.f13901j = new wa2();
            this.f31521v = null;
            this.f31520u = b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:49:0x0104  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009a, code lost:
    
        if (ads_mobile_sdk.ff3.m906a(r4, r11, r1, r5, r10) == r0) goto L26;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x00e5, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$ads_mobile_sdk$ee3(Object obj) {
        hx0 hx0Var;
        dd3 dd3Var;
        mi5 mi5Var;
        j11 j11Var;
        Throwable th;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        int i = 6;
        byte b2 = 2;
        byte b3 = 1;
        pm1 pm1Var = null;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        if (b == 0) {
            k43.m7376J(obj);
            zo0 zo0Var = (zo0) this.f31521v;
            ix0 ix0VarM7937r = lb5.m7937r(zo0Var, null, new at1((ff3) this.f31523x, b5 == true ? 1 : 0, b2), 3);
            ix0 ix0VarM7937r2 = lb5.m7937r(zo0Var, null, new at1((ff3) this.f31523x, b4 == true ? 1 : 0, b3), 3);
            this.f31521v = ix0VarM7937r2;
            this.f31520u = (byte) 1;
            Object objM5007w = ix0VarM7937r.m5007w(this);
            if (objM5007w != ap0Var) {
                hx0Var = ix0VarM7937r2;
                obj = objM5007w;
            }
            return ap0Var;
        }
        if (b == 1) {
            hx0Var = (hx0) this.f31521v;
            k43.m7376J(obj);
        } else if (b == 2) {
            dd3Var = (dd3) this.f31521v;
            k43.m7376J(obj);
            mi5Var = (mi5) obj;
            if (mi5Var instanceof q11) {
                if (mi5Var instanceof i11) {
                    C0670g.m5864c();
                    return null;
                }
                String str = "Failed to create JavaScriptSandbox: " + mi5Var;
                if (mi5Var instanceof j11) {
                    j11Var = (j11) mi5Var;
                } else {
                    j11Var = null;
                }
                if (j11Var != null) {
                    th = j11Var.f5514c;
                } else {
                    th = null;
                }
                return new j11(new n85(str, th), b7 == true ? 1 : 0, b6 == true ? 1 : 0, i);
            }
            m82 m82Var = (m82) ((q11) mi5Var).f8791b;
            ff3 ff3Var = (ff3) this.f31523x;
            int i2 = ff3Var.f3465E.get();
            this.f31521v = null;
            this.f31520u = (byte) 3;
        } else {
            if (b != 3) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k43.m7376J(obj);
        }
        if (((ff3) this.f31523x).f3465E.get() != 0) {
            return new q11(ju4.f22634a);
        }
        boolean z = ((ff3) this.f31523x).f3497y.get();
        ff3 ff3Var2 = (ff3) this.f31523x;
        if (z) {
            return ff3.m913l(ff3Var2);
        }
        return ff3Var2.f3498z ? new m11("SandboxJavascriptEngine is stopped", pm1.f8670a) : new j11(new n85("Failed to initialize any isolates", null), pm1Var, b8 == true ? 1 : 0, i);
        mi5 mi5Var2 = (mi5) obj;
        if (!(mi5Var2 instanceof q11)) {
            if (mi5Var2 instanceof i11) {
                return mi5Var2;
            }
            C0670g.m5864c();
            return null;
        }
        dd3 dd3Var2 = (dd3) ((q11) mi5Var2).f8791b;
        ((C0055bw) this.f31522w).invoke();
        this.f31521v = dd3Var2;
        this.f31520u = (byte) 2;
        Object objMo3997v = hx0Var.mo3997v(this);
        if (objMo3997v != ap0Var) {
            dd3Var = dd3Var2;
            obj = objMo3997v;
            mi5Var = (mi5) obj;
            if (mi5Var instanceof q11) {
                if (mi5Var instanceof i11) {
                    C0670g.m5864c();
                    return null;
                }
                String str2 = "Failed to create JavaScriptSandbox: " + mi5Var;
                if (mi5Var instanceof j11) {
                    j11Var = (j11) mi5Var;
                } else {
                    j11Var = null;
                }
                if (j11Var != null) {
                    th = j11Var.f5514c;
                } else {
                    th = null;
                }
                return new j11(new n85(str2, th), b7 == true ? 1 : 0, b6 == true ? 1 : 0, i);
            }
            m82 m82Var2 = (m82) ((q11) mi5Var).f8791b;
            ff3 ff3Var3 = (ff3) this.f31523x;
            int i3 = ff3Var3.f3465E.get();
            this.f31521v = null;
            this.f31520u = (byte) 3;
        }
        return ap0Var;
    }

    private final Object invokeSuspend$ads_mobile_sdk$kg1(Object obj) throws Throwable {
        nh1 nh1Var;
        gx2 gx2Var;
        gx2 gx2Var2;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        try {
            if (b == 0) {
                k43.m7376J(obj);
                nh1Var = (nh1) this.f31523x;
                gx2 gx2Var3 = nh1Var.f7751x;
                this.f31521v = gx2Var3;
                this.f31522w = nh1Var;
                this.f31520u = (byte) 1;
                if (gx2Var3.m6191e(this) != ap0Var) {
                    gx2Var = gx2Var3;
                }
                return ap0Var;
            }
            if (b != 1) {
                if (b != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gx2Var2 = (gx2) this.f31521v;
                try {
                    k43.m7376J(obj);
                    ju4 ju4Var = ju4.f22634a;
                    gx2Var2.m6193g(null);
                    return ju4Var;
                } catch (Throwable th) {
                    th = th;
                    gx2Var = gx2Var2;
                    gx2Var.m6193g(null);
                    throw th;
                }
            }
            nh1Var = (nh1) this.f31522w;
            gx2 gx2Var4 = (gx2) this.f31521v;
            k43.m7376J(obj);
            gx2Var = gx2Var4;
            Long l = new Long(Long.MAX_VALUE);
            this.f31521v = gx2Var;
            this.f31522w = null;
            this.f31520u = (byte) 2;
            if (nh1.m1794a(nh1Var, null, null, 0, l, null, null, null, null, this, 487) != ap0Var) {
                gx2Var2 = gx2Var;
                ju4 ju4Var2 = ju4.f22634a;
                gx2Var2.m6193g(null);
                return ju4Var2;
            }
            return ap0Var;
        } catch (Throwable th2) {
            th = th2;
            gx2Var.m6193g(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r3.m2210a(r15, "onSdkLoaded", r9) == r10) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$ads_mobile_sdk$ng2(Object obj) {
        s41 s41Var;
        yb1 yb1Var;
        C1199ty c1199ty;
        C0045ba c0045ba;
        i51 i51Var = (i51) this.f31522w;
        yg2 yg2Var = (yg2) this.f31523x;
        zf2 zf2Var = yg2Var.f13724e;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        ju4 ju4Var = ju4.f22634a;
        if (b != 0) {
            if (b == 1) {
                s41Var = (s41) this.f31521v;
                k43.m7376J(obj);
                c1199ty = this;
            } else {
                if (b != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                c0045ba = (C0045ba) this.f31521v;
                k43.m7376J(obj);
            }
            yg2Var.f13728i = c0045ba;
            return ju4Var;
        }
        k43.m7376J(obj);
        s41Var = i51Var.f4806a;
        C0213l2 c0213l2 = yg2Var.f13723d;
        si2 si2Var = c0213l2.f6603T;
        ri2 ri2Var = si2Var.f11657a;
        mk2 mk2Var = si2Var.f11658b;
        ri2 ri2Var2 = ri2.f10853a;
        if (ri2Var == ri2Var2) {
            yb1Var = yb1.DEFINED_BY_JAVASCRIPT;
        } else {
            yb1Var = c0213l2.f6589H == EnumC0139h2.f4233e ? yb1.ONE_PIXEL : yb1.BEGIN_TO_RENDER;
        }
        h50 h50Var = ri2Var == ri2Var2 ? h50.VIDEO : h50.HTML_DISPLAY;
        String str = c0213l2.f6656x;
        this.f31521v = s41Var;
        this.f31520u = (byte) 1;
        zf2Var.getClass();
        c1199ty = this;
        obj = zf2.m2899a(zf2Var, s41Var, mk2.JAVASCRIPT, yb1Var, h50Var, mk2Var, str, c1199ty);
        if (obj != ap0Var) {
        }
        return ap0Var;
        c0045ba = (C0045ba) obj;
        if (c0045ba == null) {
            return ju4Var;
        }
        zf2Var.m2902a(c0045ba, i51Var);
        zf2Var.getClass();
        wa2 wa2Var = new wa2();
        c1199ty.f31521v = c0045ba;
        c1199ty.f31520u = (byte) 2;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0156 A[Catch: all -> 0x0131, TRY_LEAVE, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x008d A[Catch: all -> 0x0030, TRY_LEAVE, TryCatch #0 {all -> 0x0030, blocks: (B:14:0x002c, B:29:0x0087, B:31:0x008d), top: B:106:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a2 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00b4 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00b8 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00bd A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3 A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00cb A[Catch: all -> 0x00ae, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:58:0x00d3 A[Catch: all -> 0x00ae, TRY_LEAVE, TryCatch #7 {all -> 0x00ae, blocks: (B:36:0x009b, B:38:0x00a2, B:40:0x00a6, B:42:0x00aa, B:45:0x00b0, B:47:0x00b4, B:49:0x00b8, B:51:0x00bc, B:52:0x00bd, B:53:0x00c2, B:54:0x00c3, B:55:0x00ca, B:56:0x00cb, B:57:0x00d2, B:58:0x00d3), top: B:119:0x009b }] */
    /* JADX WARN: Code duplicated, block: B:74:0x0110 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #6 {all -> 0x001b, blocks: (B:7:0x0016, B:72:0x010a, B:74:0x0110), top: B:117:0x0016 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x0125 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0137 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:92:0x013b A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:94:0x013f A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:95:0x0140 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0146 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    /* JADX WARN: Code duplicated, block: B:99:0x014e A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:79:0x011e, B:81:0x0125, B:83:0x0129, B:85:0x012d, B:88:0x0133, B:90:0x0137, B:92:0x013b, B:94:0x013f, B:95:0x0140, B:96:0x0145, B:97:0x0146, B:98:0x014d, B:99:0x014e, B:100:0x0155, B:101:0x0156), top: B:108:0x011e }] */
    private final Object invokeSuspend$ads_mobile_sdk$oz2(Object obj) {
        mx3 mx3Var;
        zm4 th;
        mx3 mx3Var2;
        mx3 mx3Var3;
        zm4 th2;
        mx3 mx3Var4;
        Object obj2;
        Object obj3;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        if (b != 0) {
            if (b == 1) {
                mx3Var3 = (mx3) this.f31522w;
                mx3Var4 = (mx3) this.f31521v;
                try {
                    k43.m7376J(obj);
                    obj2 = (si1) obj;
                    if (obj2 instanceof i11) {
                        sy3.m2306a((i11) obj2, false);
                    }
                    lb5.m7941v(mx3Var3, null);
                    return obj2;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        mx3Var4.m1736b(th2);
                        if (!(th2 instanceof ka5)) {
                            throw th2;
                        }
                        if (!(th2 instanceof zm4) && !(th2 instanceof CancellationException)) {
                            mx3Var4.m1735a(th2);
                        }
                        if (!(th2 instanceof zm4)) {
                            throw new j31(th2);
                        }
                        if (!(th2 instanceof CancellationException)) {
                            throw new w01(th2);
                        }
                        if (th2 instanceof w11) {
                            throw th2;
                        }
                        throw new b11(th2);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            lb5.m7941v(mx3Var3, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (b != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mx3Var = (mx3) this.f31522w;
            mx3Var2 = (mx3) this.f31521v;
            try {
                k43.m7376J(obj);
                obj3 = (si1) obj;
                if (obj3 instanceof i11) {
                    sy3.m2306a((i11) obj3, false);
                }
                lb5.m7941v(mx3Var, null);
                return obj3;
            } catch (Throwable th6) {
                th = th6;
                try {
                    mx3Var2.m1736b(th);
                    if (!(th instanceof ka5)) {
                        throw th;
                    }
                    if (!(th instanceof zm4)) {
                        mx3Var2.m1735a(th);
                    }
                    if (!(th instanceof zm4)) {
                        throw new j31(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new w01(th);
                    }
                    if (th instanceof w11) {
                        throw th;
                    }
                    throw new b11(th);
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        lb5.m7941v(mx3Var, th7);
                        throw th8;
                    }
                }
            }
        }
        k43.m7376J(obj);
        g03 g03Var = (g03) this.f31523x;
        xa3 xa3Var = g03Var.f3752e;
        s21 s21Var = s21.f11013E;
        List listSingletonList = Collections.singletonList(g03Var.f3754g.toString());
        g03 g03Var2 = (g03) this.f31523x;
        fy3 fy3Var = g03Var2.f3750c;
        String str = "";
        if (cy3.m656b().f1710a == null) {
            kx2 kx2VarM2635a = xa3.m2635a(xa3Var, s21Var, listSingletonList, fy3Var);
            try {
                e33 e33Var = g03Var2.f3750c.f3729a;
                e33Var.f2780a = g03Var2.f3753f;
                e33Var.f2782c = g03Var2.f3754g;
                String strMo101m = g03Var2.f3755h.mo101m();
                if (strMo101m != null) {
                    str = strMo101m;
                }
                e33Var.f2781b = str;
                e33Var.f2783f = false;
                this.f31521v = kx2VarM2635a;
                this.f31522w = kx2VarM2635a;
                this.f31520u = (byte) 1;
                Object objM1004a = g03Var2.m1004a(this);
                if (objM1004a != ap0Var) {
                    mx3Var3 = kx2VarM2635a;
                    obj = objM1004a;
                    mx3Var4 = mx3Var3;
                    obj2 = (si1) obj;
                    if (obj2 instanceof i11) {
                        sy3.m2306a((i11) obj2, false);
                    }
                    lb5.m7941v(mx3Var3, null);
                    return obj2;
                }
            } catch (Throwable th9) {
                mx3Var3 = kx2VarM2635a;
                th2 = th9;
                mx3Var4 = mx3Var3;
                mx3Var4.m1736b(th2);
                if (!(th2 instanceof ka5)) {
                    throw th2;
                }
                if (!(th2 instanceof zm4)) {
                    mx3Var4.m1735a(th2);
                }
                if (!(th2 instanceof zm4)) {
                    throw new j31(th2);
                }
                if (!(th2 instanceof CancellationException)) {
                    throw new w01(th2);
                }
                if (th2 instanceof w11) {
                    throw th2;
                }
                throw new b11(th2);
            }
        } else {
            mx3 mx3VarM655a = cy3.m655a(s21Var, v71.f32439a, true);
            try {
                e33 e33Var2 = g03Var2.f3750c.f3729a;
                e33Var2.f2780a = g03Var2.f3753f;
                e33Var2.f2782c = g03Var2.f3754g;
                String strMo101m2 = g03Var2.f3755h.mo101m();
                if (strMo101m2 != null) {
                    str = strMo101m2;
                }
                e33Var2.f2781b = str;
                e33Var2.f2783f = false;
                this.f31521v = mx3VarM655a;
                this.f31522w = mx3VarM655a;
                this.f31520u = (byte) 2;
                Object objM1004a2 = g03Var2.m1004a(this);
                if (objM1004a2 != ap0Var) {
                    mx3Var = mx3VarM655a;
                    obj = objM1004a2;
                    mx3Var2 = mx3Var;
                    obj3 = (si1) obj;
                    if (obj3 instanceof i11) {
                        sy3.m2306a((i11) obj3, false);
                    }
                    lb5.m7941v(mx3Var, null);
                    return obj3;
                }
            } catch (Throwable th10) {
                mx3Var = mx3VarM655a;
                th = th10;
                mx3Var2 = mx3Var;
                mx3Var2.m1736b(th);
                if (!(th instanceof ka5)) {
                    throw th;
                }
                if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                    mx3Var2.m1735a(th);
                }
                if (!(th instanceof zm4)) {
                    throw new j31(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new w01(th);
                }
                if (th instanceof w11) {
                    throw th;
                }
                throw new b11(th);
            }
        }
        return ap0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083 A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0099 A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x009d A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x009e A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a4 A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac A[Catch: all -> 0x008f, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x00b4 A[Catch: all -> 0x008f, TRY_LEAVE, TryCatch #7 {all -> 0x008f, blocks: (B:32:0x007c, B:34:0x0083, B:36:0x0087, B:38:0x008b, B:41:0x0091, B:43:0x0095, B:45:0x0099, B:47:0x009d, B:48:0x009e, B:49:0x00a3, B:50:0x00a4, B:51:0x00ab, B:52:0x00ac, B:53:0x00b3, B:54:0x00b4), top: B:111:0x007c, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00e3 A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5 A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f9 A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0104 A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x010c A[Catch: all -> 0x00ef, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0114 A[Catch: all -> 0x00ef, TRY_LEAVE, TryCatch #8 {all -> 0x00ef, blocks: (B:69:0x00dc, B:71:0x00e3, B:73:0x00e7, B:75:0x00eb, B:78:0x00f1, B:80:0x00f5, B:82:0x00f9, B:84:0x00fd, B:85:0x00fe, B:86:0x0103, B:87:0x0104, B:88:0x010b, B:89:0x010c, B:90:0x0113, B:91:0x0114), top: B:112:0x00dc, outer: #3 }] */
    private final Object invokeSuspend$ads_mobile_sdk$p54(Object obj) {
        mx3 mx3VarM655a;
        mx3 mx3Var;
        mx3 mx3VarM2635a;
        mx3 mx3Var2;
        ju4 ju4Var = ju4.f22634a;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        try {
            if (b == 0) {
                k43.m7376J(obj);
                t54 t54Var = (t54) this.f31523x;
                xa3 xa3Var = t54Var.f11891h;
                s21 s21Var = s21.f11051S;
                v71 v71Var = v71.f32439a;
                fy3 fy3Var = new fy3(new e33(), new aq1(), new d63(), new C0217lc());
                if (cy3.m656b().f1710a == null) {
                    mx3VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
                    try {
                        this.f31521v = mx3VarM2635a;
                        this.f31522w = mx3VarM2635a;
                        this.f31520u = (byte) 1;
                        if (t54.m2310a(t54Var, this) != ap0Var) {
                            mx3Var2 = mx3VarM2635a;
                            lb5.m7941v(mx3Var2, null);
                        }
                    } catch (Throwable th) {
                        th = th;
                        mx3Var2 = mx3VarM2635a;
                        mx3VarM2635a.m1736b(th);
                        if (!(th instanceof ka5)) {
                            throw th;
                        }
                        if (!(th instanceof zm4)) {
                            mx3VarM2635a.m1735a(th);
                        }
                        if (!(th instanceof zm4)) {
                            throw new j31(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    }
                } else {
                    mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
                    try {
                        this.f31521v = mx3VarM655a;
                        this.f31522w = mx3VarM655a;
                        this.f31520u = (byte) 2;
                        if (t54.m2310a(t54Var, this) != ap0Var) {
                            mx3Var = mx3VarM655a;
                            lb5.m7941v(mx3Var, null);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        mx3Var = mx3VarM655a;
                        mx3VarM655a.m1736b(th);
                        if (!(th instanceof ka5)) {
                            throw th;
                        }
                        if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                            mx3VarM655a.m1735a(th);
                        }
                        if (!(th instanceof zm4)) {
                            throw new j31(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    }
                }
                return ap0Var;
            }
            if (b == 1) {
                mx3Var2 = (mx3) this.f31522w;
                mx3VarM2635a = (mx3) this.f31521v;
                try {
                    k43.m7376J(obj);
                    lb5.m7941v(mx3Var2, null);
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        mx3VarM2635a.m1736b(th);
                        if (!(th instanceof ka5)) {
                            throw th;
                        }
                        if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                            mx3VarM2635a.m1735a(th);
                        }
                        if (!(th instanceof zm4)) {
                            throw new j31(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            lb5.m7941v(mx3Var2, th4);
                            throw th5;
                        }
                    }
                }
            } else {
                if (b != 2) {
                    C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mx3Var = (mx3) this.f31522w;
                mx3VarM655a = (mx3) this.f31521v;
                try {
                    k43.m7376J(obj);
                    lb5.m7941v(mx3Var, null);
                } catch (Throwable th6) {
                    th = th6;
                    try {
                        mx3VarM655a.m1736b(th);
                        if (!(th instanceof ka5)) {
                            throw th;
                        }
                        if (!(th instanceof zm4)) {
                            mx3VarM655a.m1735a(th);
                        }
                        if (!(th instanceof zm4)) {
                            throw new j31(th);
                        }
                        if (!(th instanceof CancellationException)) {
                            throw new w01(th);
                        }
                        if (th instanceof w11) {
                            throw th;
                        }
                        throw new b11(th);
                    } catch (Throwable th7) {
                        try {
                            throw th7;
                        } catch (Throwable th8) {
                            lb5.m7941v(mx3Var, th7);
                            throw th8;
                        }
                    }
                }
            }
            ((t54) this.f31523x).f11894k.m11767h0();
            return ju4Var;
        } catch (Throwable th9) {
            ((t54) this.f31523x).f11894k.m11767h0();
            throw th9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r0.m13159a(r1, (ads_mobile_sdk.q11) r10, r3, r9) == r2) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$ads_mobile_sdk$q83(Object obj) {
        C1372yl c1372yl = (C1372yl) this.f31521v;
        Uri uri = (Uri) this.f31522w;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        try {
            if (b != 0) {
                if (b == 1) {
                    k43.m7376J(obj);
                } else {
                    if (b != 2) {
                        C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    k43.m7376J(obj);
                }
                return ju4.f22634a;
            }
            k43.m7376J(obj);
            Map mapM1189a = ((C0152hw) c1372yl.f35309f).m1189a(uri);
            g75 g75Var = (g75) c1372yl.f35307d;
            URL url = new URL(uri.toString());
            this.f31520u = (byte) 1;
            obj = g75.m5909a(g75Var, url, mapM1189a, this, 26);
            if (obj == ap0Var) {
            }
            return ap0Var;
            mi5 mi5Var = (mi5) obj;
            if (mi5Var instanceof q11) {
                C0413y3 c0413y3 = (C0413y3) this.f31523x;
                this.f31520u = (byte) 2;
            }
        } catch (Exception e) {
            AbstractC0137h.m1112b("Error while pinging URL: " + uri + ": " + e.getMessage(), null);
        }
        return ju4.f22634a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082 A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0094 A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0098 A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:44:0x009c A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:45:0x009d A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00a3 A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ab A[Catch: all -> 0x008e, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00b3 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #6 {all -> 0x008e, blocks: (B:29:0x007b, B:31:0x0082, B:33:0x0086, B:35:0x008a, B:38:0x0090, B:40:0x0094, B:42:0x0098, B:44:0x009c, B:45:0x009d, B:46:0x00a2, B:47:0x00a3, B:48:0x00aa, B:49:0x00ab, B:50:0x00b2, B:51:0x00b3), top: B:103:0x007b }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00db A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x00ed A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x00f1 A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f5 A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x00f6 A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0104 A[Catch: all -> 0x00e7, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x010c A[Catch: all -> 0x00e7, TRY_LEAVE, TryCatch #4 {all -> 0x00e7, blocks: (B:65:0x00d4, B:67:0x00db, B:69:0x00df, B:71:0x00e3, B:74:0x00e9, B:76:0x00ed, B:78:0x00f1, B:80:0x00f5, B:81:0x00f6, B:82:0x00fb, B:83:0x00fc, B:84:0x0103, B:85:0x0104, B:86:0x010b, B:87:0x010c), top: B:100:0x00d4 }] */
    private final Object invokeSuspend$ads_mobile_sdk$wf2(Object obj) {
        zm4 th;
        mx3 mx3Var;
        mx3 mx3Var2;
        zm4 th2;
        mx3 mx3Var3;
        mx3 mx3Var4;
        ju4 ju4Var = ju4.f22634a;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        if (b != 0) {
            if (b == 1) {
                mx3Var4 = (mx3) this.f31522w;
                mx3Var3 = (mx3) this.f31521v;
                try {
                    k43.m7376J(obj);
                    lb5.m7941v(mx3Var4, null);
                    return ju4Var;
                } catch (Throwable th3) {
                    th2 = th3;
                    try {
                        mx3Var3.m1736b(th2);
                        if (!(th2 instanceof ka5)) {
                            throw th2;
                        }
                        if (!(th2 instanceof zm4) && !(th2 instanceof CancellationException)) {
                            mx3Var3.m1735a(th2);
                        }
                        if (!(th2 instanceof zm4)) {
                            throw new j31(th2);
                        }
                        if (!(th2 instanceof CancellationException)) {
                            throw new w01(th2);
                        }
                        if (th2 instanceof w11) {
                            throw th2;
                        }
                        throw new b11(th2);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            lb5.m7941v(mx3Var4, th4);
                            throw th5;
                        }
                    }
                }
            }
            if (b != 2) {
                C1077qn.m9989o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mx3Var2 = (mx3) this.f31522w;
            mx3Var = (mx3) this.f31521v;
            try {
                k43.m7376J(obj);
                lb5.m7941v(mx3Var2, null);
                return ju4Var;
            } catch (Throwable th6) {
                th = th6;
                try {
                    mx3Var.m1736b(th);
                    if (!(th instanceof ka5)) {
                        throw th;
                    }
                    if (!(th instanceof zm4)) {
                        mx3Var.m1735a(th);
                    }
                    if (!(th instanceof zm4)) {
                        throw new j31(th);
                    }
                    if (!(th instanceof CancellationException)) {
                        throw new w01(th);
                    }
                    if (th instanceof w11) {
                        throw th;
                    }
                    throw new b11(th);
                } catch (Throwable th7) {
                    try {
                        throw th7;
                    } catch (Throwable th8) {
                        lb5.m7941v(mx3Var2, th7);
                        throw th8;
                    }
                }
            }
        }
        k43.m7376J(obj);
        zf2 zf2Var = (zf2) this.f31523x;
        xa3 xa3Var = zf2Var.f14201g;
        s21 s21Var = s21.f11129p;
        v71 v71Var = v71.f32439a;
        fy3 fy3Var = new fy3(new e33(), new aq1(), new d63(), new C0217lc());
        if (cy3.m656b().f1710a == null) {
            kx2 kx2VarM2635a = xa3.m2635a(xa3Var, s21Var, v71Var, fy3Var);
            try {
                this.f31521v = kx2VarM2635a;
                this.f31522w = kx2VarM2635a;
                this.f31520u = (byte) 1;
                if (zf2.m2901a(zf2Var, this) != ap0Var) {
                    mx3Var4 = kx2VarM2635a;
                    lb5.m7941v(mx3Var4, null);
                    return ju4Var;
                }
            } catch (Throwable th9) {
                th2 = th9;
                mx3Var3 = kx2VarM2635a;
                mx3Var4 = mx3Var3;
                mx3Var3.m1736b(th2);
                if (!(th2 instanceof ka5)) {
                    throw th2;
                }
                if (!(th2 instanceof zm4)) {
                    mx3Var3.m1735a(th2);
                }
                if (!(th2 instanceof zm4)) {
                    throw new j31(th2);
                }
                if (!(th2 instanceof CancellationException)) {
                    throw new w01(th2);
                }
                if (th2 instanceof w11) {
                    throw th2;
                }
                throw new b11(th2);
            }
        } else {
            mx3 mx3VarM655a = cy3.m655a(s21Var, v71Var, true);
            try {
                this.f31521v = mx3VarM655a;
                this.f31522w = mx3VarM655a;
                this.f31520u = (byte) 2;
                if (zf2.m2901a(zf2Var, this) != ap0Var) {
                    mx3Var2 = mx3VarM655a;
                    lb5.m7941v(mx3Var2, null);
                    return ju4Var;
                }
            } catch (Throwable th10) {
                th = th10;
                mx3Var = mx3VarM655a;
                mx3Var2 = mx3Var;
                mx3Var.m1736b(th);
                if (!(th instanceof ka5)) {
                    throw th;
                }
                if (!(th instanceof zm4) && !(th instanceof CancellationException)) {
                    mx3Var.m1735a(th);
                }
                if (!(th instanceof zm4)) {
                    throw new j31(th);
                }
                if (!(th instanceof CancellationException)) {
                    throw new w01(th);
                }
                if (th instanceof w11) {
                    throw th;
                }
                throw new b11(th);
            }
        }
        return ap0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004d, code lost:
    
        if (r0.mo1486a(r6, ads_mobile_sdk.ty0.f12119c, r5) == r1) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$ads_mobile_sdk$xv0(Object obj) {
        ki2 ki2Var = ((yv0) this.f31521v).f13879r;
        ap0 ap0Var = ap0.f14763a;
        byte b = this.f31520u;
        if (b == 0) {
            k43.m7376J(obj);
            ox2 ox2Var = (ox2) this.f31522w;
            this.f31520u = (byte) 1;
            if (ki2Var.mo1487a(ox2Var, this) != ap0Var) {
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
            k43.m7376J(obj);
        }
        return ju4.f22634a;
        m65 m65Var = (m65) ((WeakReference) this.f31523x).get();
        if (m65Var != null && (r6 = ((e62) m65Var).m811d()) != null) {
            this.f31520u = (byte) 2;
        }
        return ju4.f22634a;
    }

    @Override // p000.AbstractC0888lx
    public final wm0 create(wm0 wm0Var, Object obj) {
        byte b = this.f31519t;
        Object obj2 = this.f31523x;
        switch (b) {
            case 0:
                return new C1199ty(this.f31522w, obj2, wm0Var, (byte) 0);
            case 1:
                C1199ty c1199ty = new C1199ty(this.f31522w, obj2, wm0Var, (byte) 1);
                c1199ty.f31521v = obj;
                return c1199ty;
            case 2:
                C1199ty c1199ty2 = new C1199ty(obj2, wm0Var, (byte) 2);
                c1199ty2.f31522w = obj;
                return c1199ty2;
            case 3:
                return new C1199ty((ru0) this.f31521v, (ks2) this.f31522w, (gh3) obj2, wm0Var, (byte) 3);
            case 4:
                C1199ty c1199ty3 = new C1199ty(obj2, wm0Var, (byte) 4);
                c1199ty3.f31522w = obj;
                return c1199ty3;
            case 5:
                return new C1199ty((dh1) this.f31521v, (ro0) this.f31522w, (m34) obj2, wm0Var, (byte) 5);
            case 6:
                return new C1199ty((yp1) this.f31521v, (xs1) this.f31522w, (C0910mi) obj2, wm0Var, (byte) 6);
            case 7:
                return new C1199ty((mq1) this.f31521v, (u93) this.f31522w, (yp1) obj2, wm0Var, (byte) 7);
            case 8:
                C1199ty c1199ty4 = new C1199ty(this.f31522w, obj2, wm0Var, (byte) 8);
                c1199ty4.f31521v = obj;
                return c1199ty4;
            case 9:
                C1199ty c1199ty5 = new C1199ty(this.f31522w, obj2, wm0Var, (byte) 9);
                c1199ty5.f31521v = obj;
                return c1199ty5;
            case 10:
                return new C1199ty(this.f31522w, obj2, wm0Var, (byte) 10);
            case 11:
                return new C1199ty((h35) this.f31521v, (Worker) this.f31522w, (d25) obj2, wm0Var, (byte) 11);
            case 12:
                return new C1199ty(this.f31522w, obj2, wm0Var, (byte) 12);
            case 13:
                return new C1199ty((Uri) this.f31521v, (WebResourceRequest) obj2, (h51) this.f31522w, wm0Var);
            case 14:
                C1199ty c1199ty6 = new C1199ty((ff3) obj2, wm0Var, (C0055bw) this.f31522w);
                c1199ty6.f31521v = obj;
                return c1199ty6;
            case 15:
                return new C1199ty(obj2, wm0Var, (byte) 15);
            case 16:
                return new C1199ty(obj2, wm0Var, (byte) 16);
            case 17:
                return new C1199ty((yg2) obj2, (i51) this.f31522w, wm0Var);
            case 18:
                return new C1199ty(obj2, wm0Var, (byte) 18);
            case 19:
                return new C1199ty(obj2, wm0Var, (byte) 19);
            case 20:
                return new C1199ty((C1372yl) this.f31521v, (Uri) this.f31522w, (C0413y3) obj2, wm0Var, (byte) 20);
            case 21:
                return new C1199ty(obj2, wm0Var, (byte) 21);
            case 22:
                return new C1199ty((yv0) this.f31521v, (ox2) this.f31522w, (WeakReference) obj2, wm0Var, (byte) 22);
            default:
                return new C1199ty(obj2, wm0Var, (byte) 23);
        }
    }

    @Override // p000.mq1
    public final Object invoke(Object obj, Object obj2) throws Exception {
        byte b = this.f31519t;
        Object obj3 = this.f31523x;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 1:
                return ((C1199ty) create((wm0) obj2, (si1) obj)).invokeSuspend(ju4Var);
            case 2:
                return ((C1199ty) create((wm0) obj2, (ti1) obj)).invokeSuspend(ju4Var);
            case 3:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 4:
                ((C1199ty) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
                return ap0.f14763a;
            case 5:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 6:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 7:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 8:
                return ((C1199ty) create((wm0) obj2, (lg3) obj)).invokeSuspend(ju4Var);
            case 9:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 10:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 11:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 12:
                return new C1199ty(this.f31522w, obj3, (wm0) obj2, (byte) 12).invokeSuspend(ju4Var);
            case 13:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 14:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 15:
                return new C1199ty(obj3, (wm0) obj2, (byte) 15).invokeSuspend(ju4Var);
            case 16:
                return new C1199ty(obj3, (wm0) obj2, (byte) 16).invokeSuspend(ju4Var);
            case 17:
                return new C1199ty((yg2) obj3, (i51) this.f31522w, (wm0) obj2).invokeSuspend(ju4Var);
            case 18:
                return new C1199ty(obj3, (wm0) obj2, (byte) 18).invokeSuspend(ju4Var);
            case 19:
                return new C1199ty(obj3, (wm0) obj2, (byte) 19).invokeSuspend(ju4Var);
            case 20:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            case 21:
                return new C1199ty(obj3, (wm0) obj2, (byte) 21).invokeSuspend(ju4Var);
            case 22:
                return ((C1199ty) create((wm0) obj2, (zo0) obj)).invokeSuspend(ju4Var);
            default:
                return new C1199ty(obj3, (wm0) obj2, (byte) 23).invokeSuspend(ju4Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:395:0x06b1  */
    /* JADX WARN: Code duplicated, block: B:398:0x06c9  */
    /* JADX WARN: Code duplicated, block: B:462:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:465:0x0802  */
    /* JADX WARN: Code duplicated, block: B:468:0x085f  */
    /* JADX WARN: Code duplicated, block: B:471:0x0866  */
    /* JADX WARN: Code duplicated, block: B:474:0x086b  */
    /* JADX WARN: Code duplicated, block: B:476:0x0870  */
    /* JADX WARN: Code duplicated, block: B:478:0x0874  */
    /* JADX WARN: Code duplicated, block: B:480:0x0878  */
    /* JADX WARN: Code duplicated, block: B:483:0x087e  */
    /* JADX WARN: Code duplicated, block: B:485:0x0882  */
    /* JADX WARN: Code duplicated, block: B:486:0x0886  */
    /* JADX WARN: Code duplicated, block: B:487:0x088a  */
    /* JADX WARN: Code duplicated, block: B:489:0x088f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:400:0x06df -> B:395:0x06b1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0888lx
    public final java.lang.Object invokeSuspend(java.lang.Object r22) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 2448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C1199ty.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1199ty(Object obj, Object obj2, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31519t = b;
        this.f31522w = obj;
        this.f31523x = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1199ty(Object obj, Object obj2, Object obj3, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31519t = b;
        this.f31521v = obj;
        this.f31522w = obj2;
        this.f31523x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199ty(ff3 ff3Var, wm0 wm0Var, C0055bw c0055bw) {
        super(2, wm0Var);
        this.f31519t = (byte) 14;
        this.f31522w = c0055bw;
        this.f31523x = ff3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1199ty(yg2 yg2Var, i51 i51Var, wm0 wm0Var) {
        super(2, wm0Var);
        this.f31519t = (byte) 17;
        this.f31522w = i51Var;
        this.f31523x = yg2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1199ty(Object obj, wm0 wm0Var, byte b) {
        super(2, wm0Var);
        this.f31519t = b;
        this.f31523x = obj;
    }
}

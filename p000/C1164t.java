package p000;

import android.app.KeyguardManager;
import android.app.RemoteAction;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.media.session.MediaSessionManager;
import android.os.PowerManager;
import android.view.textclassifier.TextClassification;
import essentials.notificationlistener.EsNotificationListenerService;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: t */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1164t implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f30698a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f30699b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30700c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f30701d;

    public /* synthetic */ C1164t(byte b) {
        this.f30698a = b;
    }

    /* JADX WARN: Code duplicated, block: B:328:0x022c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0215 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0217 A[LOOP:1: B:61:0x01d5->B:74:0x0217, LOOP_END] */
    /* JADX WARN: Not initialized variable reg: 22, insn: 0x0729: MOVE (r1 I:??[OBJECT, ARRAY]) = (r22 I:??[OBJECT, ARRAY]) (LINE:1834), block:B:250:0x0729 */
    @Override // p000.yp1
    public final Object invoke(Object obj) throws Throwable {
        float f;
        h70 h70Var;
        pg0 pg0Var;
        pg0 pg0Var2;
        Object objM8132g;
        Object obj2;
        Object obj3;
        uj2 uj2Var;
        wp1 wp1Var;
        byte b = this.f30698a;
        byte b2 = 4;
        byte b3 = 13;
        byte b4 = 8;
        pg0 pg0Var3 = null;
        ju4 ju4Var = ju4.f22634a;
        boolean zBooleanValue = false;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        boolean z2 = false;
        byte b5 = 2;
        byte b6 = 1;
        switch (b) {
            case 0:
                a44 a44Var = (a44) this.f30700c;
                yp1 yp1Var = (yp1) this.f30699b;
                a83 a83Var = (a83) this.f30701d;
                pg2 pg2Var = AbstractC1238v.f32279a;
                a83Var.m133i(a83Var.m132h() + 1);
                tt2 tt2Var = cv0.f16504b;
                ic2[] ic2VarArr = cv0.f16503a;
                if (((Boolean) tt2Var.m11153t(a44Var, ic2VarArr[0])).booleanValue() && a83Var.m132h() == 7) {
                    tt2 tt2Var2 = cv0.f16505c;
                    ic2 ic2Var = ic2VarArr[1];
                    tt2Var2.m11144C(a44Var, Boolean.TRUE);
                    yp1Var.invoke("Show debug!");
                }
                if (a83Var.m132h() == 69) {
                    yp1Var.invoke("Debug mode enabled!");
                    ic2 ic2Var2 = ic2VarArr[0];
                    tt2Var.m11144C(a44Var, Boolean.TRUE);
                }
                return ju4Var;
            case 1:
                lk2 lk2Var = (lk2) this.f30700c;
                yp1 yp1Var2 = (yp1) this.f30699b;
                wp1 wp1Var2 = (wp1) this.f30701d;
                C0749i4 c0749i4 = new C0749i4((byte) 0);
                c0749i4.f21112b = yp1Var2;
                VarHandle.storeStoreFence();
                lk2Var.getLifecycle().mo6015a(c0749i4);
                C0785j4 c0785j4 = new C0785j4((byte) 0);
                c0785j4.f21994b = wp1Var2;
                c0785j4.f21995c = lk2Var;
                c0785j4.f21996d = c0749i4;
                VarHandle.storeStoreFence();
                return c0785j4;
            case 2:
                gy4 gy4Var = (gy4) this.f30700c;
                wf2 wf2Var = (wf2) this.f30699b;
                gy4 gy4Var2 = (gy4) this.f30701d;
                h70 h70VarM7248w = ((u31) obj).mo7035J().m7248w();
                if (gy4Var.f15285b.getVisibility() != 8) {
                    gy4Var.f15308y = true;
                    r63 r63Var = wf2Var.f33325o;
                    ViewTreeObserverOnGlobalLayoutListenerC1140sc viewTreeObserverOnGlobalLayoutListenerC1140sc = r63Var instanceof ViewTreeObserverOnGlobalLayoutListenerC1140sc ? (ViewTreeObserverOnGlobalLayoutListenerC1140sc) r63Var : null;
                    if (viewTreeObserverOnGlobalLayoutListenerC1140sc != null) {
                        Canvas canvas = AbstractC1362yb.f35080a;
                        Canvas canvas2 = ((C1325xb) h70VarM7248w).f34122a;
                        viewTreeObserverOnGlobalLayoutListenerC1140sc.getAndroidViewsHandler$ui().getClass();
                        gy4Var2.draw(canvas2);
                    }
                    gy4Var.f15308y = false;
                }
                return ju4Var;
            case 3:
                nl3 nl3Var = (nl3) this.f30700c;
                ho4 ho4Var = (ho4) this.f30699b;
                nl3 nl3Var2 = (nl3) this.f30701d;
                C1370yj c1370yj = (C1370yj) obj;
                float fFloatValue = ((Number) c1370yj.f35255e.getValue()).floatValue() - nl3Var.f25933a;
                float fM13399h = ho4Var.f20759d.m13399h();
                ho4Var.m6465b(fM13399h + fFloatValue);
                float fAbs = Math.abs(fM13399h - ho4Var.f20759d.m13399h());
                nl3Var.f25933a = ((Number) c1370yj.f35255e.getValue()).floatValue();
                nl3Var2.f25933a = ((Number) c1370yj.m13146b()).floatValue();
                if (Math.abs(fFloatValue - fAbs) > 0.5f) {
                    c1370yj.m13145a();
                }
                return ju4Var;
            case 4:
                po3 po3Var = (po3) this.f30700c;
                sw2 sw2Var = (sw2) this.f30701d;
                yp1 yp1Var3 = (yp1) this.f30699b;
                vg2 vg2Var = (vg2) obj;
                if (po3Var instanceof om2) {
                    oi2.m9121c(vg2Var, "loading", c20.f15762d, 2);
                } else {
                    C0761ih c0761ih = new C0761ih((byte) 1);
                    c0761ih.f21416b = sw2Var;
                    VarHandle.storeStoreFence();
                    mz3.m8469k(vg2Var, null, c0761ih, 3);
                    List<l73> list = po3Var instanceof ke4 ? ((ke4) po3Var).f23085a : null;
                    if (list != null) {
                        for (l73 l73Var : list) {
                            String str = (String) l73Var.f23833a;
                            List list2 = (List) l73Var.f23834b;
                            byte b7 = 0;
                            C0914mm c0914mm = new C0914mm(b7);
                            c0914mm.f25018b = str;
                            VarHandle.storeStoreFence();
                            pg0 pg0Var4 = new pg0(-678004135, true, c0914mm);
                            C0951nm c0951nm = new C0951nm(b7);
                            c0951nm.f25937b = list2;
                            c0951nm.f25938c = yp1Var3;
                            VarHandle.storeStoreFence();
                            mz3.m8468j(vg2Var, pg0Var4, str, c0951nm);
                        }
                    }
                }
                return ju4Var;
            case 5:
                lb5.m7910S((zo0) this.f30700c, null, null, new C0671g0((nl1) obj, (sw2) this.f30699b, (co4) this.f30701d, null, (byte) 9), 3);
                return ju4Var;
            case 6:
                String str2 = (String) this.f30700c;
                zo0 zo0Var = (zo0) this.f30699b;
                co4 co4Var = (co4) this.f30701d;
                C0675g4 c0675g4 = new C0675g4((byte) 9);
                c0675g4.f19600b = zo0Var;
                c0675g4.f19601c = co4Var;
                VarHandle.storeStoreFence();
                ic2[] ic2VarArr2 = o14.f26289a;
                ((q14) obj).mo4898a(d14.f16706c, new C1353y2(str2, c0675g4));
                return ju4Var;
            case 7:
                yp1 yp1Var4 = (yp1) this.f30699b;
                sw2 sw2Var2 = (sw2) this.f30700c;
                sw2 sw2Var3 = (sw2) this.f30701d;
                kz3 kz3Var = (kz3) obj;
                xb0 xb0Var = new xb0((byte) 0);
                xb0Var.f34126b = yp1Var4;
                xb0Var.f34127c = sw2Var2;
                xb0Var.f34128d = sw2Var3;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(-1937706018, true, xb0Var));
                xb0 xb0Var2 = new xb0((byte) 1);
                xb0Var2.f34126b = yp1Var4;
                xb0Var2.f34127c = sw2Var2;
                xb0Var2.f34128d = sw2Var3;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(-50502699, true, xb0Var2));
                xb0 xb0Var3 = new xb0(b5);
                xb0Var3.f34126b = yp1Var4;
                xb0Var3.f34127c = sw2Var2;
                xb0Var3.f34128d = sw2Var3;
                VarHandle.storeStoreFence();
                kz3Var.m7753a(null, new pg0(1502584662, true, xb0Var3));
                return ju4Var;
            case 8:
                fm0 fm0Var = (fm0) this.f30700c;
                t82 t82Var = (t82) this.f30699b;
                ty3 ty3Var = (ty3) this.f30701d;
                float fFloatValue2 = ((Float) obj).floatValue();
                f = fm0Var.f19110q ? 1.0f : -1.0f;
                vy3 vy3Var = fm0Var.f19109p;
                long jM12033f = vy3Var.m12033f(vy3Var.m12036i(f * fFloatValue2));
                vy3 vy3Var2 = ty3Var.f31538a;
                float fM12035h = vy3Var.m12035h(vy3Var.m12033f(vy3Var2.m12031d(vy3Var2.f32968k, jM12033f, 1))) * f;
                if (Math.abs(fM12035h) < Math.abs(fFloatValue2)) {
                    CancellationException cancellationException = new CancellationException("Scroll animation cancelled because scroll was not consumed (" + fM12035h + " < " + fFloatValue2 + ")");
                    cancellationException.initCause(null);
                    t82Var.mo4993a(cancellationException);
                }
                return ju4Var;
            case 9:
                ig1 ig1Var = ig1.f21365D;
                uj2 uj2Var2 = (uj2) this.f30700c;
                xk4 xk4Var = (xk4) this.f30699b;
                vi3 vi3Var = (vi3) this.f30701d;
                u31 u31Var = (u31) obj;
                kl4 kl4VarM11577d = uj2Var2.m11577d();
                if (kl4VarM11577d != null) {
                    h70 h70VarM7248w2 = u31Var.mo7035J().m7248w();
                    long j = ((ql4) uj2Var2.f31910A.getValue()).f28558a;
                    long j2 = ((ql4) uj2Var2.f31911B.getValue()).f28558a;
                    jl4 jl4Var = kl4VarM11577d.f23216a;
                    yu2 yu2Var = jl4Var.f22401b;
                    il4 il4Var = jl4Var.f22400a;
                    C1253ve c1253ve = uj2Var2.f31936y;
                    long j3 = uj2Var2.f31937z;
                    if (!ql4.m9900d(j)) {
                        c1253ve.m11881k(j3);
                        int iM9903g = ql4.m9903g(j);
                        vi3Var.m11898a(iM9903g);
                        int iM9902f = ql4.m9902f(j);
                        vi3Var.m11898a(iM9902f);
                        if (iM9903g != iM9902f) {
                            h70VarM7248w2.mo6250f(jl4Var.m7182h(iM9903g, iM9902f), c1253ve);
                        }
                    } else if (!ql4.m9900d(j2)) {
                        pb0 pb0VarM9462a = pb0.m9462a(il4Var.f21534b.m12710b());
                        if (pb0VarM9462a.f27503a == 16) {
                            pb0VarM9462a = null;
                        }
                        long j4 = pb0VarM9462a != null ? pb0VarM9462a.f27503a : pb0.f27495b;
                        c1253ve.m11881k(pb0.m9464c(j4, pb0.m9465d(j4) * 0.2f, 0.0f, 0.0f, 0.0f, 14));
                        int iM9903g2 = ql4.m9903g(j2);
                        vi3Var.m11898a(iM9903g2);
                        int iM9902f2 = ql4.m9902f(j2);
                        vi3Var.m11898a(iM9902f2);
                        if (iM9903g2 != iM9902f2) {
                            h70VarM7248w2.mo6250f(jl4Var.m7182h(iM9903g2, iM9902f2), c1253ve);
                        }
                    } else if (!ql4.m9900d(xk4Var.f34342b)) {
                        c1253ve.m11881k(j3);
                        long j5 = xk4Var.f34342b;
                        int iM9903g3 = ql4.m9903g(j5);
                        vi3Var.m11898a(iM9903g3);
                        int iM9902f3 = ql4.m9902f(j5);
                        vi3Var.m11898a(iM9902f3);
                        if (iM9903g3 != iM9902f3) {
                            h70VarM7248w2.mo6250f(jl4Var.m7182h(iM9903g3, iM9902f3), c1253ve);
                        }
                    }
                    long j6 = jl4Var.f22402c;
                    float f2 = (int) (j6 >> 32);
                    yu2 yu2Var2 = jl4Var.f22401b;
                    boolean z3 = ((f2 > yu2Var2.f35535d ? 1 : (f2 == yu2Var2.f35535d ? 0 : -1)) < 0 || yu2Var2.f35534c || (((float) ((int) (j6 & 4294967295L))) > yu2Var2.f35536e ? 1 : (((float) ((int) (j6 & 4294967295L))) == yu2Var2.f35536e ? 0 : -1)) < 0) && il4Var.f21538f != 3;
                    if (z3) {
                        long j7 = jl4Var.f22402c;
                        jl3 jl3VarM5672j = AbstractC0647fd.m5672j(0L, (((long) Float.floatToRawIntBits((int) (j7 >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j7 & 4294967295L))) & 4294967295L));
                        h70VarM7248w2.mo6253j();
                        h70.m6244i(h70VarM7248w2, jl3VarM5672j);
                    }
                    pa4 pa4Var = il4Var.f21534b.f34389a;
                    uj4 uj4Var = pa4Var.f27490m;
                    yk4 yk4Var = pa4Var.f27478a;
                    if (uj4Var == null) {
                        uj4Var = uj4.f31938b;
                    }
                    uj4 uj4Var2 = uj4Var;
                    m44 m44Var = pa4Var.f27491n;
                    if (m44Var == null) {
                        m44Var = m44.f24642d;
                    }
                    m44 m44Var2 = m44Var;
                    qq2 qq2Var = pa4Var.f27492o;
                    if (qq2Var == null) {
                        qq2Var = uf1.f31820j;
                    }
                    qq2 qq2Var2 = qq2Var;
                    try {
                        t30 t30VarMo5690f = yk4Var.mo5690f();
                        try {
                            if (t30VarMo5690f != null) {
                                yu2.m13241i(yu2Var, h70VarM7248w2, t30VarMo5690f, yk4Var != ig1Var ? yk4Var.mo5691h() : 1.0f, m44Var2, uj4Var2, qq2Var2);
                                h70VarM7248w2 = h70VarM7248w2;
                            } else {
                                long jMo5689a = yk4Var != ig1Var ? yk4Var.mo5689a() : pb0.f27495b;
                                h70VarM7248w2.mo6253j();
                                ArrayList arrayList = yu2Var.f35539h;
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    n73 n73Var = (n73) arrayList.get(i);
                                    h70 h70Var2 = h70VarM7248w2;
                                    n73Var.f25497a.m12677e(h70Var2, jMo5689a, m44Var2, uj4Var2, qq2Var2);
                                    h70VarM7248w2 = h70Var2;
                                    h70VarM7248w2.mo6249e(0.0f, n73Var.f25497a.f34187e);
                                }
                                h70VarM7248w2.mo6251g();
                            }
                            if (z3) {
                                h70VarM7248w2.mo6251g();
                            }
                        } catch (Throwable th) {
                            th = th;
                            h70VarM7248w2 = h70Var;
                            if (z3) {
                                h70VarM7248w2.mo6251g();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                return ju4Var;
            case 10:
                dj4 dj4Var = (dj4) this.f30700c;
                Context context = (Context) this.f30699b;
                pj4 pj4Var = (pj4) this.f30701d;
                pm0 pm0Var = (pm0) obj;
                List list3 = dj4Var.f17107a;
                int size2 = list3.size();
                int i2 = 0;
                while (i2 < size2) {
                    cj4 cj4Var = (cj4) list3.get(i2);
                    if (cj4Var instanceof kj4) {
                        C1017p0 c1017p0 = new C1017p0((byte) 15);
                        kj4 kj4Var = (kj4) cj4Var;
                        c1017p0.f27254b = kj4Var;
                        VarHandle.storeStoreFence();
                        if (kj4Var.f23181c != 0) {
                            cx0 cx0Var = new cx0(zBooleanValue ? (byte) 1 : (byte) 0);
                            cx0Var.f16562b = kj4Var;
                            VarHandle.storeStoreFence();
                            pg0Var3 = new pg0(-1930700965, true, cx0Var);
                        }
                        C0675g4 c0675g5 = new C0675g4((byte) 23);
                        c0675g5.f19600b = kj4Var;
                        c0675g5.f19601c = pj4Var;
                        VarHandle.storeStoreFence();
                        pm0.m9567b(pm0Var, c1017p0, pg0Var3, c0675g5, 6);
                    } else if (cj4Var instanceof qj4) {
                        qj4 qj4Var = (qj4) cj4Var;
                        if (context != null) {
                            int i3 = qj4Var.f28531c;
                            TextClassification textClassification = qj4Var.f28530b;
                            Drawable drawable = qj4Var.f28532d;
                            if (i3 < 0) {
                                u04 u04Var = new u04(b4);
                                u04Var.f31581b = textClassification;
                                VarHandle.storeStoreFence();
                                if (drawable != null) {
                                    jj4 jj4Var = new jj4(zBooleanValue ? (byte) 1 : (byte) 0);
                                    jj4Var.f22341b = drawable;
                                    VarHandle.storeStoreFence();
                                    pg0Var2 = new pg0(-1123224187, true, jj4Var);
                                } else {
                                    pg0Var2 = null;
                                }
                                jp1 jp1Var = new jp1((byte) 24);
                                jp1Var.f22485b = context;
                                jp1Var.f22486c = textClassification;
                                VarHandle.storeStoreFence();
                                pm0.m9567b(pm0Var, u04Var, pg0Var2, jp1Var, 6);
                            } else {
                                RemoteAction remoteAction = textClassification.getActions().get(i3);
                                u04 u04Var2 = new u04((byte) 9);
                                u04Var2.f31581b = remoteAction;
                                VarHandle.storeStoreFence();
                                if (drawable != null) {
                                    jj4 jj4Var2 = new jj4(b6);
                                    jj4Var2.f22341b = drawable;
                                    VarHandle.storeStoreFence();
                                    pg0Var = new pg0(1106162332, true, jj4Var2);
                                } else {
                                    pg0Var = null;
                                }
                                g32 g32Var = new g32((byte) 29);
                                g32Var.f19558b = remoteAction;
                                VarHandle.storeStoreFence();
                                pm0.m9567b(pm0Var, u04Var2, pg0Var, g32Var, 6);
                            }
                        }
                    } else if (cj4Var instanceof oj4) {
                        pm0Var.f27742a.add(z62.f35781c);
                    }
                    i2++;
                    pg0Var3 = null;
                }
                return ju4Var;
            case 11:
                dz0 dz0Var = (dz0) this.f30700c;
                dz0Var.f17510a.setValue(((PowerManager) this.f30699b).isInteractive() ? ((KeyguardManager) this.f30701d).isDeviceLocked() ? uw3.f32215b : uw3.f32216c : uw3.f32214a);
                return ju4Var;
            case 12:
                zq2 zq2Var = (zq2) this.f30700c;
                a31 a31Var = (a31) this.f30699b;
                db3 db3Var = (db3) this.f30701d;
                cb3 cb3Var = (cb3) obj;
                boolean zMo3587z = zq2Var.mo3587z();
                C0940nb c0940nb = a31Var.f75o;
                float fM11656f = zMo3587z ? c0940nb.m8670h().m11656f(((wy0) a31Var.f75o.f25611h).getValue()) : ((z73) c0940nb.f25612i).m13399h();
                boolean zMo3587z2 = zq2Var.mo3587z();
                if (!Float.isNaN(fM11656f)) {
                    f = (sc6.m10652X(a31Var).f33293A == df2.f17012b && a31Var.f77q == d63.f16815b) ? -1.0f : 1.0f;
                    d63 d63Var = a31Var.f77q;
                    float f3 = d63Var == d63.f16815b ? f * fM11656f : 0.0f;
                    float f4 = d63Var == d63.f16814a ? fM11656f : 0.0f;
                    cb3Var.f15915a = true;
                    cb3Var.m3952k(db3Var, qq2.m10010E(f3), qq2.m10010E(f4), 0.0f);
                    cb3Var.f15915a = false;
                    return ju4Var;
                }
                boolean z4 = a31Var.f78r;
                uv0 uv0VarM8670h = a31Var.f75o.m8670h();
                Object value = ((wy0) a31Var.f75o.f25611h).getValue();
                C0977ob c0977ob = new C0977ob();
                c0977ob.f26535a = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + zMo3587z2 + ",didLookahead=" + z4 + ",anchors=" + uv0VarM8670h + ",targetValue=" + value;
                VarHandle.storeStoreFence();
                throw c0977ob;
            case 13:
                vv0 vv0Var = (vv0) this.f30700c;
                l31 l31Var = (l31) this.f30699b;
                d63 d63Var2 = (d63) this.f30701d;
                long j8 = ((e21) obj).f17638a;
                long jM3431i = l31Var.f23760N ? b33.m3431i(j8, -1.0f) : b33.m3431i(j8, 1.0f);
                d31 d31Var = j31.f21983a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (d63Var2 == d63.f16814a ? jM3431i & 4294967295L : jM3431i >> 32));
                switch (vv0Var.f32884a) {
                    case 0:
                        ((wv0) vv0Var.f32885b).f33749a.invoke(Float.valueOf(fIntBitsToFloat));
                        return ju4Var;
                    default:
                        ((k84) vv0Var.f32885b).m7425b(fIntBitsToFloat, null);
                        return ju4Var;
                }
            case 14:
                xn2 xn2Var = (xn2) this.f30700c;
                b23 b23Var = (b23) this.f30699b;
                EsNotificationListenerService esNotificationListenerService = (EsNotificationListenerService) this.f30701d;
                int i4 = EsNotificationListenerService.f18453c;
                if (xn2Var != null) {
                    String strM12721a = xn2Var.m12721a();
                    k44 k44Var = k44.f22883b;
                    if (xn2Var.f34459a.m8274a().compareTo(k44Var) <= 0) {
                        xn2Var.m12722b(k44Var, strM12721a, "service started", null);
                    }
                }
                b23Var.f15039b.setValue(esNotificationListenerService);
                ba3.m3533a();
                C0562d4 c0562d4 = new C0562d4(b4);
                c0562d4.f16768b = xn2Var;
                c0562d4.f16769c = b23Var;
                VarHandle.storeStoreFence();
                return c0562d4;
            case 15:
                yp1 yp1Var5 = (yp1) this.f30699b;
                ie1 ie1Var = (ie1) this.f30700c;
                wp1 wp1Var3 = (wp1) this.f30701d;
                at1 at1Var = new at1(b2);
                at1Var.f14856c = yp1Var5;
                at1Var.f14855b = ie1Var;
                at1Var.f14857d = wp1Var3;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(126992114, true, at1Var));
                return ju4Var;
            case 16:
                sl1 sl1Var = (sl1) this.f30700c;
                bl1 bl1Var = (bl1) this.f30701d;
                yp1 yp1Var6 = (yp1) this.f30699b;
                sl1 sl1Var2 = (sl1) obj;
                if (!z62.m13387o(sl1Var2, sl1Var)) {
                    if (z62.m13387o(sl1Var2, bl1Var.f15396c)) {
                        C1077qn.m9989o("Focus search landed at the root.");
                        return null;
                    }
                    zBooleanValue = ((Boolean) yp1Var6.invoke(sl1Var2)).booleanValue();
                }
                return Boolean.valueOf(zBooleanValue);
            case 17:
                ag0 ag0Var = (ag0) this.f30700c;
                Intent intent = (Intent) this.f30701d;
                yp1 yp1Var7 = (yp1) this.f30699b;
                zf0 zf0Var = ag0Var.f14455i;
                String string = UUID.randomUUID().toString();
                C0006a5 c0006a5 = new C0006a5(b6);
                C1040pn c1040pn = new C1040pn(b3);
                c1040pn.f27754b = yp1Var7;
                VarHandle.storeStoreFence();
                C0638f5 c0638f5M13545c = zf0Var.m13545c(string, c0006a5, c1040pn);
                try {
                    c0638f5M13545c.m5556C(intent, null);
                    break;
                } catch (Throwable th3) {
                    yc1 yc1VarM10807c = sj3.m10807c(th3);
                    ep3 ep3Var = new ep3();
                    ep3Var.f18355a = yc1VarM10807c;
                    VarHandle.storeStoreFence();
                    yp1Var7.invoke(ep3Var);
                }
                C1032pf c1032pf = new C1032pf((byte) 8);
                c1032pf.f27570b = c0638f5M13545c;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 18:
                lk2 lk2Var2 = (lk2) this.f30700c;
                pk2 pk2Var = (pk2) this.f30701d;
                yp1 yp1Var8 = (yp1) this.f30699b;
                ql3 ql3Var = new ql3();
                hk2 hk2Var = new hk2((byte) 1);
                hk2Var.f20641d = pk2Var;
                hk2Var.f20639b = ql3Var;
                hk2Var.f20640c = yp1Var8;
                VarHandle.storeStoreFence();
                lk2Var2.getLifecycle().mo6015a(hk2Var);
                C0785j4 c0785j5 = new C0785j4((byte) 4);
                c0785j5.f21995c = lk2Var2;
                c0785j5.f21994b = hk2Var;
                c0785j5.f21996d = ql3Var;
                VarHandle.storeStoreFence();
                return c0785j5;
            case 19:
                lk2 lk2Var3 = (lk2) this.f30700c;
                tk2 tk2Var = (tk2) this.f30701d;
                yp1 yp1Var9 = (yp1) this.f30699b;
                ql3 ql3Var2 = new ql3();
                hk2 hk2Var2 = new hk2((byte) 0);
                hk2Var2.f20641d = tk2Var;
                hk2Var2.f20639b = ql3Var2;
                hk2Var2.f20640c = yp1Var9;
                VarHandle.storeStoreFence();
                lk2Var3.getLifecycle().mo6015a(hk2Var2);
                C0785j4 c0785j6 = new C0785j4((byte) 5);
                c0785j6.f21995c = lk2Var3;
                c0785j6.f21994b = hk2Var2;
                c0785j6.f21996d = ql3Var2;
                VarHandle.storeStoreFence();
                return c0785j6;
            case 20:
                Context context2 = (Context) this.f30700c;
                MediaSessionManager mediaSessionManager = (MediaSessionManager) this.f30699b;
                sw2 sw2Var4 = (sw2) this.f30701d;
                ComponentName componentName = new ComponentName(context2, (Class<?>) EsNotificationListenerService.class);
                nr2 nr2Var = new nr2();
                nr2Var.f26054a = sw2Var4;
                VarHandle.storeStoreFence();
                mediaSessionManager.addOnActiveSessionsChangedListener(nr2Var, componentName);
                sw2Var4.setValue(mediaSessionManager.getActiveSessions(componentName));
                C0785j4 c0785j7 = new C0785j4((byte) 6);
                c0785j7.f21994b = mediaSessionManager;
                c0785j7.f21995c = nr2Var;
                c0785j7.f21996d = sw2Var4;
                VarHandle.storeStoreFence();
                return c0785j7;
            case 21:
                Set set = (Set) this.f30700c;
                dv2 dv2Var = (dv2) this.f30699b;
                ql3 ql3Var3 = (ql3) this.f30701d;
                if (set.contains(obj) && (objM8132g = dv2Var.f17425f.m8132g(obj)) != null) {
                    if (objM8132g instanceof mw2) {
                        mw2 mw2Var = (mw2) objM8132g;
                        Object[] objArr = mw2Var.f25258b;
                        long[] jArr = mw2Var.f25257a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i5 = 0;
                            while (true) {
                                long j9 = jArr[i5];
                                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i6 = 8 - ((~(i5 - length)) >>> 31);
                                    for (int i7 = 0; i7 < i6; i7++) {
                                        if ((255 & j9) < 128) {
                                            y14 y14Var = (y14) objArr[(i5 << 3) + i7];
                                            Object obj4 = ql3Var3.f28555a;
                                            if (obj4 == null) {
                                                obj3 = obj4;
                                                ArrayList arrayList2 = new ArrayList();
                                                ql3Var3.f28555a = arrayList2;
                                                obj3 = arrayList2;
                                            }
                                            obj3 = obj4;
                                            ((List) obj3).add(y14Var);
                                        }
                                        j9 >>= 8;
                                    }
                                    if (i6 == 8) {
                                        if (i5 != length) {
                                            i5++;
                                        }
                                    }
                                } else if (i5 != length) {
                                    i5++;
                                }
                            }
                        }
                    } else {
                        y14 y14Var2 = (y14) objM8132g;
                        Object obj5 = ql3Var3.f28555a;
                        if (obj5 == null) {
                            obj2 = obj5;
                            ArrayList arrayList3 = new ArrayList();
                            ql3Var3.f28555a = arrayList3;
                            obj2 = arrayList3;
                        }
                        obj2 = obj5;
                        ((List) obj2).add(y14Var2);
                    }
                }
                return ju4Var;
            case 22:
                kz2 kz2Var = (kz2) this.f30700c;
                oh0 oh0Var = (oh0) this.f30699b;
                C1283w7 c1283w7 = (C1283w7) this.f30701d;
                if (kz2Var.f23636e != null) {
                    xy4.m12784m("NavigationEventState '", kz2Var, "' is already registered with a NavigationEventHandler '", oh0Var, "'.");
                    return null;
                }
                kz2Var.f23636e = oh0Var;
                C1283w7.m12113e(c1283w7, oh0Var);
                C0562d4 c0562d5 = new C0562d4((byte) 12);
                c0562d5.f16768b = oh0Var;
                c0562d5.f16769c = kz2Var;
                VarHandle.storeStoreFence();
                return c0562d5;
            case 23:
                Map map = (Map) this.f30700c;
                ny2 ny2Var = (ny2) this.f30699b;
                xz2 xz2Var = (xz2) this.f30701d;
                vz2 vz2Var = new vz2(b6);
                vz2Var.f32984b = ny2Var;
                vz2Var.f32985c = xz2Var;
                VarHandle.storeStoreFence();
                map.put(ny2Var.f26195b, new pg0(1887319909, true, vz2Var));
                C0562d4 c0562d6 = new C0562d4(b3);
                c0562d6.f16768b = map;
                c0562d6.f16769c = ny2Var;
                VarHandle.storeStoreFence();
                return c0562d6;
            case 24:
                iu3 iu3Var = (iu3) this.f30700c;
                Object obj6 = this.f30699b;
                pu3 pu3Var = (pu3) this.f30701d;
                lw2 lw2Var = iu3Var.f21806b;
                if (lw2Var.m8127b(obj6)) {
                    xy4.m12783l("Key ", obj6, " was used multiple times ");
                    return null;
                }
                iu3Var.f21805a.remove(obj6);
                lw2Var.m8138m(obj6, pu3Var);
                C0785j4 c0785j8 = new C0785j4((byte) 8);
                c0785j8.f21994b = iu3Var;
                c0785j8.f21995c = obj6;
                c0785j8.f21996d = pu3Var;
                VarHandle.storeStoreFence();
                return c0785j8;
            case 25:
                rd6 rd6Var = (rd6) this.f30700c;
                ds3 ds3Var = (ds3) this.f30699b;
                ml3 ml3Var = (ml3) this.f30701d;
                lc3 lc3Var = (lc3) obj;
                long j10 = lc3Var.f23937c;
                pk4 pk4Var = (pk4) rd6Var.f29198d;
                if (pk4Var.m9547i() && pk4Var.m9550l().f34341a.f24092b.length() != 0 && (uj2Var = pk4Var.f27696d) != null && uj2Var.m11577d() != null) {
                    rd6Var.m10305d(pk4Var.m9550l(), j10, false, ds3Var);
                    z2 = true;
                }
                if (z2) {
                    lc3Var.m7952a();
                    ml3Var.f25002a = true;
                }
                return ju4Var;
            case 26:
                return new d64((Set) this.f30700c, (wp1) this.f30701d, (e64) obj, (yp1) this.f30699b);
            case 27:
                C1127s c1127s = (C1127s) this.f30700c;
                C1283w7 c1283w8 = (C1283w7) this.f30699b;
                en0 en0Var = (en0) this.f30701d;
                Throwable th4 = (Throwable) obj;
                c1127s.invoke(th4);
                f40 f40Var = (f40) c1283w8.f33129e;
                f40Var.m5486f(th4, false);
                while (true) {
                    Object objM8979b = o80.m8979b(f40Var.mo3510i());
                    if (objM8979b == null) {
                        return ju4Var;
                    }
                    en0Var.invoke(objM8979b, th4);
                }
                break;
            case 28:
                k84 k84Var = (k84) this.f30700c;
                yp1 yp1Var10 = (yp1) this.f30699b;
                wp1 wp1Var4 = (wp1) this.f30701d;
                float fFloatValue3 = ((Float) obj).floatValue();
                ma0 ma0Var = k84Var.f22986a;
                float fM10674o = sc6.m10674o(fFloatValue3, ma0Var.f24778a, ma0Var.f24779b);
                if (fM10674o != k84Var.f22987b.m13399h()) {
                    yp1Var10.invoke(Float.valueOf(fM10674o));
                    if (wp1Var4 != null) {
                        wp1Var4.invoke();
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                k84 k84Var2 = (k84) this.f30700c;
                sw2 sw2Var5 = (sw2) this.f30699b;
                sw2 sw2Var6 = (sw2) this.f30701d;
                k84Var2.m7425b(0.0f, (yp1) sw2Var5.getValue());
                if (!((Boolean) k84Var2.f22997l.getValue()).booleanValue() && (wp1Var = (wp1) sw2Var6.getValue()) != null) {
                    wp1Var.invoke();
                }
                return ju4Var;
        }
    }
}

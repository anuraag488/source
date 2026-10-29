package p000;

import android.os.Looper;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.lang.invoke.VarHandle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cz3 implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f16637a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f16638b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f16639c;

    public /* synthetic */ cz3(byte b) {
        this.f16637a = b;
    }

    /* JADX WARN: Code duplicated, block: B:123:0x043a  */
    @Override // p000.yp1
    public final Object invoke(Object obj) throws Exception {
        byte b = 19;
        byte b2 = 3;
        float fAbs = 0.0f;
        wm0 wm0Var = null;
        boolean z = true;
        switch (this.f16637a) {
            case 0:
                yp1 yp1Var = (yp1) this.f16638b;
                Float f = (Float) obj;
                ((z73) this.f16639c).m13400i(f.floatValue());
                if (yp1Var != null) {
                    yp1Var.invoke(f);
                }
                return ju4.f22634a;
            case 1:
                ((sw2) this.f16639c).setValue(Boolean.valueOf(((int) (((w52) obj).f33109a & 4294967295L)) == kl0.m7538h(((v20) this.f16638b).f32325b)));
                return ju4.f22634a;
            case 2:
                dc0 dc0Var = (dc0) this.f16638b;
                d64 d64Var = (d64) this.f16639c;
                u31 u31Var = (u31) obj;
                long j = dc0Var.f16916C;
                if (d64Var.f16820d.m8670h().f32203c != 0) {
                    C0940nb c0940nb = d64Var.f16820d;
                    e64 e64Var = e64.f17842a;
                    e64 e64Var2 = e64.f17843b;
                    float fM11656f = c0940nb.m8670h().m11656f(e64Var);
                    float fM11656f2 = c0940nb.m8670h().m11656f(e64Var2);
                    float fM10674o = (sc6.m10674o(((z73) c0940nb.f25612i).m13399h(), Math.min(fM11656f, fM11656f2), Math.max(fM11656f, fM11656f2)) - fM11656f) / (fM11656f2 - fM11656f);
                    if (Float.isNaN(fM10674o)) {
                        fAbs = 1.0f;
                    } else if (fM10674o >= 1.0E-6f) {
                        if (fM10674o > 0.999999f) {
                            fAbs = 1.0f;
                        } else {
                            fAbs = Math.abs(fM10674o);
                        }
                    }
                }
                u31.m11225x(u31Var, pb0.m9464c(j, fAbs * 0.32f, 0.0f, 0.0f, 0.0f, 14), 0L, 0L, null, 126);
                return ju4.f22634a;
            case 3:
                cb3.m3946u((cb3) obj, (db3) this.f16638b, 0, 0, ((y64) this.f16639c).f34951B, 4);
                return ju4.f22634a;
            case 4:
                ((k84) this.f16639c).m7425b(((Float) obj).floatValue(), (yp1) this.f16638b);
                return ju4.f22634a;
            case 5:
                C1370yj c1370yj = (C1370yj) obj;
                ((mq1) this.f16638b).invoke(c1370yj.f35255e.getValue(), ((sq4) this.f16639c).f30509b.invoke(c1370yj.f35256f));
                return ju4.f22634a;
            case 6:
                ((kg4) this.f16638b).f23112b.m13540A((ve4) obj, (ig4) this.f16639c);
                return ju4.f22634a;
            case 7:
                ba4 ba4Var = (ba4) this.f16638b;
                kx1 kx1Var = (kx1) this.f16639c;
                ba4Var.add(kx1Var);
                C0562d4 c0562d4 = new C0562d4((byte) 15);
                c0562d4.f16768b = ba4Var;
                c0562d4.f16769c = kx1Var;
                VarHandle.storeStoreFence();
                return c0562d4;
            case 8:
                zg4 zg4Var = (zg4) this.f16638b;
                fh4 fh4Var = (fh4) this.f16639c;
                zg4Var.f36068b.setValue(w52.m12106a(((w52) obj).f33109a));
                fh4Var.setSystemGestureExclusionRects(v71.f32439a);
                return ju4.f22634a;
            case 9:
                zo0 zo0Var = (zo0) this.f16638b;
                nh4 nh4Var = (nh4) this.f16639c;
                js1 js1Var = new js1();
                VarHandle.storeStoreFence();
                nh4Var.f25818g = js1Var;
                lb5.m7910S(zo0Var, null, cp0.f16328d, new it1((Object) js1Var, (Object) new C1215ud(nh4Var, wm0Var, b2), wm0Var, (byte) 5), 1);
                xg4 xg4Var = new xg4(z ? (byte) 1 : (byte) 0);
                xg4Var.f34274b = nh4Var;
                VarHandle.storeStoreFence();
                return xg4Var;
            case 10:
                lh4 lh4Var = (lh4) this.f16638b;
                nh4 nh4Var2 = (nh4) this.f16639c;
                lh4Var.f24036a.add(nh4Var2.f25828q);
                C0562d4 c0562d5 = new C0562d4((byte) 17);
                c0562d5.f16768b = lh4Var;
                c0562d5.f16769c = nh4Var2;
                VarHandle.storeStoreFence();
                return c0562d5;
            case 11:
                wp1 wp1Var = (wp1) this.f16638b;
                wp1 wp1Var2 = (wp1) this.f16639c;
                pj4 pj4Var = (pj4) obj;
                wp1Var.invoke();
                if (wp1Var2 != null ? ((Boolean) wp1Var2.invoke()).booleanValue() : true) {
                    pj4Var.close();
                }
                return ju4.f22634a;
            case 12:
                hn4 hn4Var = (hn4) this.f16638b;
                sw2 sw2Var = (sw2) this.f16639c;
                AccessibilityEvent accessibilityEvent = (AccessibilityEvent) obj;
                ju4 ju4Var = ju4.f22634a;
                if (accessibilityEvent.isFullScreen() && !z62.m13387o(accessibilityEvent.getPackageName(), "com.android.systemui")) {
                    hn4Var.m6457c(null);
                } else if ((16 & accessibilityEvent.getContentChangeTypes()) != 0 || (accessibilityEvent.getContentChangeTypes() & 8) != 0) {
                    hn4Var.m6457c((oh4) ((Map) sw2Var.getValue()).get(hb0.m6301M0(accessibilityEvent.getText())));
                } else if ((accessibilityEvent.getContentChangeTypes() & 32) != 0) {
                    hn4Var.m6457c(null);
                }
                return ju4Var;
            case 13:
                bp4 bp4Var = (bp4) this.f16638b;
                bp4 bp4Var2 = (bp4) this.f16639c;
                jp3 jp3Var = (jp3) obj;
                jp3Var.m7257k(((Number) bp4Var.f15494j.getValue()).floatValue());
                jp3Var.m7258l(((Number) bp4Var.f15494j.getValue()).floatValue());
                jp3Var.m7253b(((Number) bp4Var2.f15494j.getValue()).floatValue());
                return ju4.f22634a;
            case 14:
                lb5.m7910S((zo0) this.f16638b, null, cp0.f16328d, new iy2((dp4) this.f16639c, null), 1);
                return new C1069qf((byte) 2);
            case 15:
                dp4 dp4Var = (dp4) this.f16638b;
                bp4 bp4Var3 = (bp4) this.f16639c;
                dp4Var.f17267j.add(bp4Var3);
                C0562d4 c0562d6 = new C0562d4((byte) 20);
                c0562d6.f16768b = dp4Var;
                c0562d6.f16769c = bp4Var3;
                VarHandle.storeStoreFence();
                return c0562d6;
            case 16:
                dp4 dp4Var2 = (dp4) this.f16638b;
                dp4 dp4Var3 = (dp4) this.f16639c;
                dp4Var2.f17268k.add(dp4Var3);
                C0562d4 c0562d7 = new C0562d4((byte) 18);
                c0562d7.f16768b = dp4Var2;
                c0562d7.f16769c = dp4Var3;
                VarHandle.storeStoreFence();
                return c0562d7;
            case 17:
                dp4 dp4Var4 = (dp4) this.f16638b;
                yo4 yo4Var = (yo4) this.f16639c;
                C0562d4 c0562d8 = new C0562d4(b);
                c0562d8.f16768b = dp4Var4;
                c0562d8.f16769c = yo4Var;
                VarHandle.storeStoreFence();
                return c0562d8;
            case 18:
                zh0 zh0Var = (zh0) this.f16638b;
                zo0 zo0Var2 = (zo0) this.f16639c;
                Thread threadCurrentThread = Thread.currentThread();
                cz3 cz3Var = new cz3(b);
                cz3Var.f16638b = threadCurrentThread;
                cz3Var.f16639c = zo0Var2;
                VarHandle.storeStoreFence();
                ((yz3) zh0Var).m13276D(new aa4(cz3Var));
                C1032pf c1032pf = new C1032pf((byte) 16);
                c1032pf.f27570b = zh0Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 19:
                Thread thread = (Thread) this.f16638b;
                zo0 zo0Var3 = (zo0) this.f16639c;
                wp1 wp1Var3 = (wp1) obj;
                if (thread == Thread.currentThread()) {
                    wp1Var3.invoke();
                } else {
                    lb5.m7910S(zo0Var3, null, null, new C1088qy(wp1Var3, wm0Var, (byte) 4), 3);
                }
                return ju4.f22634a;
            case 20:
                pq3 pq3Var = (pq3) this.f16638b;
                fs4 fs4Var = (fs4) this.f16639c;
                is4 is4Var = (is4) obj;
                synchronized (((f70) pq3Var.f27896b)) {
                    try {
                        boolean zMo6154c = is4Var.mo6154c();
                        bp2 bp2Var = (bp2) pq3Var.f27897c;
                        if (zMo6154c) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return ju4.f22634a;
            case 21:
                zg0 zg0Var = (zg0) this.f16638b;
                wp1 wp1Var4 = (wp1) this.f16639c;
                zg0Var.invoke((sn0) obj);
                wp1Var4.invoke();
                return ju4.f22634a;
            case 22:
                iv4 iv4Var = (iv4) this.f16639c;
                yp1 yp1Var2 = (yp1) this.f16638b;
                ((Long) obj).longValue();
                float f2 = iv4Var.f21829e;
                iv4Var.f21829e = 0.0f;
                yp1Var2.invoke(Float.valueOf(f2));
                return ju4.f22634a;
            case 23:
                y05 y05Var = (y05) this.f16638b;
                View view = (View) this.f16639c;
                y05Var.m12813a(view);
                C0562d4 c0562d9 = new C0562d4((byte) 21);
                c0562d9.f16768b = y05Var;
                c0562d9.f16769c = view;
                VarHandle.storeStoreFence();
                return c0562d9;
            case 24:
                ((l25) this.f16638b).f23751b.m13540A((ve4) obj, (k25) this.f16639c);
                return ju4.f22634a;
            case 25:
                f25 f25Var = (f25) this.f16638b;
                String str = (String) this.f16639c;
                ve4 ve4Var = (ve4) obj;
                gf4 gf4VarM11888b = ve4Var.m11888b("UPDATE workspec SET state=? WHERE id=?");
                try {
                    gf4VarM11888b.mo5117z(1, y70.m13016Q(f25Var));
                    gf4VarM11888b.mo5109a(2, str);
                    gf4VarM11888b.mo5112g();
                    return Integer.valueOf(d24.m4323x(ve4Var));
                } finally {
                    gf4VarM11888b.close();
                }
            case 26:
                zs0 zs0Var = (zs0) this.f16638b;
                String str2 = (String) this.f16639c;
                gf4 gf4VarM11888b2 = ((ve4) obj).m11888b("UPDATE workspec SET output=? WHERE id=?");
                try {
                    zs0 zs0Var2 = zs0.f36338b;
                    gf4VarM11888b2.mo5108E(1, C0006a5.m57M(zs0Var));
                    gf4VarM11888b2.mo5109a(2, str2);
                    gf4VarM11888b2.mo5112g();
                    return ju4.f22634a;
                } finally {
                    gf4VarM11888b2.close();
                }
            case 27:
                ((u25) this.f16638b).f31630b.m13540A((ve4) obj, (q25) this.f16639c);
                return ju4.f22634a;
            case 28:
                ((w25) this.f16638b).f33050b.m13540A((ve4) obj, (v25) this.f16639c);
                return ju4.f22634a;
            default:
                n35 n35Var = (n35) this.f16638b;
                mq1 mq1Var = (mq1) this.f16639c;
                ii0 ii0Var = (ii0) obj;
                if (!n35Var.f25426c) {
                    ii0Var.m6809e();
                    View view2 = ii0Var.f21434a;
                    gk2 lifecycle = ii0Var.f21437d.getLifecycle();
                    n35Var.f25428e = mq1Var;
                    if (n35Var.f25427d == null) {
                        if (z62.m13387o(Looper.myLooper(), view2.getHandler().getLooper())) {
                            n35Var.f25427d = lifecycle;
                            lifecycle.mo6015a(n35Var);
                        } else {
                            RunnableC1285w9 runnableC1285w9 = new RunnableC1285w9((byte) 25);
                            runnableC1285w9.f33164b = n35Var;
                            runnableC1285w9.f33165c = lifecycle;
                            VarHandle.storeStoreFence();
                            view2.post(runnableC1285w9);
                        }
                    } else if (lifecycle.mo6016b().m5728a(fk2.f19056c)) {
                        zi0 zi0Var = n35Var.f25425b;
                        C0712h4 c0712h4 = new C0712h4((byte) 10);
                        c0712h4.f20357b = n35Var;
                        c0712h4.f20358c = ii0Var;
                        c0712h4.f20359d = mq1Var;
                        VarHandle.storeStoreFence();
                        zi0Var.m13573B(new pg0(-1723985096, true, c0712h4));
                    }
                }
                return ju4.f22634a;
        }
    }
}

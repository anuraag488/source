package p000;

import ads_mobile_sdk.C0310ra;
import ads_mobile_sdk.a31;
import ads_mobile_sdk.at0;
import ads_mobile_sdk.bk1;
import ads_mobile_sdk.da4;
import ads_mobile_sdk.eh2;
import ads_mobile_sdk.zs0;
import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import java.lang.invoke.VarHandle;
import java.security.KeyPairGenerator;
import java.security.Provider;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class f70 implements qo0, le4, f44, w81, ai3, ad2, we1, d13, cr0, q54, ja0, sz4, t65, qi5, af5 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f18797a;

    public /* synthetic */ f70(byte b) {
        this.f18797a = b;
    }

    /* JADX INFO: renamed from: A */
    public static double m5594A(on4 on4Var, double d, double d2) {
        return sc6.m10673n(m5598t(on4Var.f26915a, on4Var.f26916b * 1.0d, 100.0d, true), d, d2);
    }

    /* JADX INFO: renamed from: B */
    public static double m5595B(on4 on4Var, double d, double d2) {
        return sc6.m10673n(m5598t(on4Var.f26915a, on4Var.f26916b, 0.0d, false), d, d2);
    }

    /* JADX INFO: renamed from: r */
    public static zs0 m5596r(Context context, String str) {
        if (str == null || context == null) {
            return null;
        }
        try {
            if (!"FireTVFOSDAT".equals(str)) {
                return null;
            }
            zs0 zs0Var = new zs0();
            zs0Var.f14313a = context;
            zs0Var.f14314b = at0.m303a(context);
            VarHandle.storeStoreFence();
            return zs0Var;
        } catch (Exception e) {
            Log.e("OMIDLIB", "Error creating attestation mechanism: ".concat(str), e);
            return null;
        }
    }

    /* JADX INFO: renamed from: s */
    public static c44 m5597s(q50 q50Var) {
        return new c44(System.currentTimeMillis() + 3600000, new z34(8), new y34(true, false, false), 10.0d, 1.2d, 60);
    }

    /* JADX INFO: renamed from: t */
    public static double m5598t(double d, double d2, double d3, boolean z) {
        rv1 rv1Var = new rv1(AbstractC1356y5.m12899H(d, d2, d3));
        double d4 = d3;
        while (true) {
            double d5 = rv1Var.f29662c;
            if (d5 >= d2 || 0.0d > d3 || d3 > 100.0d) {
                break;
            }
            d3 += z ? -1.0d : 1.0d;
            rv1 rv1Var2 = new rv1(AbstractC1356y5.m12899H(d, d2, d3));
            if (d5 < rv1Var2.f29662c) {
                d4 = d3;
                rv1Var = rv1Var2;
            }
        }
        return d4;
    }

    /* JADX INFO: renamed from: u */
    public static bn0 m5599u(double d) {
        if (d == 1.5d) {
            return new bn0(1.5d, 1.5d, 3.0d, 5.5d);
        }
        if (d == 3.0d) {
            return new bn0(3.0d, 3.0d, 4.5d, 7.0d);
        }
        if (d == 4.5d) {
            return new bn0(4.5d, 4.5d, 7.0d, 11.0d);
        }
        if (d == 6.0d) {
            return new bn0(6.0d, 6.0d, 7.0d, 11.0d);
        }
        if (d == 7.0d) {
            return new bn0(7.0d, 7.0d, 11.0d, 21.0d);
        }
        if (d == 9.0d) {
            return new bn0(9.0d, 9.0d, 11.0d, 21.0d);
        }
        if (d == 11.0d) {
            return new bn0(11.0d, 11.0d, 21.0d, 21.0d);
        }
        return d == 21.0d ? new bn0(21.0d, 21.0d, 21.0d, 21.0d) : new bn0(d, d, 7.0d, 21.0d);
    }

    /* JADX INFO: renamed from: v */
    public static double m5600v(rv1 rv1Var, boolean z, x41 x41Var) {
        int i;
        double dM5601w = m5601w(rv1Var);
        if (x41Var != x41.f33974c) {
            i = 12;
        } else if (z) {
            i = (dM5601w < 105.0d || dM5601w >= 125.0d) ? 14 : 6;
        } else {
            i = 18;
        }
        return i;
    }

    /* JADX INFO: renamed from: w */
    public static double m5601w(rv1 rv1Var) {
        return C0638f5.m5552w(rv1Var, new double[]{0.0d, 71.0d, 124.0d, 253.0d, 278.0d, 300.0d, 360.0d}, new double[]{10.0d, 0.0d, 10.0d, 0.0d, 10.0d, 0.0d});
    }

    /* JADX INFO: renamed from: x */
    public static double m5602x(rv1 rv1Var, x41 x41Var) {
        double dM5603y = m5603y(rv1Var);
        int i = 28;
        if (x41Var != x41.f33974c && (dM5603y < 250.0d || dM5603y >= 270.0d)) {
            i = 20;
        }
        return i;
    }

    /* JADX INFO: renamed from: y */
    public static double m5603y(rv1 rv1Var) {
        return C0638f5.m5552w(rv1Var, new double[]{0.0d, 38.0d, 105.0d, 140.0d, 333.0d, 360.0d}, new double[]{-14.0d, 10.0d, -14.0d, 10.0d, -14.0d});
    }

    /* JADX INFO: renamed from: z */
    public static double m5604z(on4 on4Var) {
        return m5594A(on4Var, 0.0d, 100.0d);
    }

    @Override // p000.qi5
    /* JADX INFO: renamed from: a */
    public void mo1284a(String str, JSONObject jSONObject) {
        if ("attest".equals(str)) {
            try {
                String string = jSONObject.getString("mechanism");
                String string2 = jSONObject.getString("version");
                HashMap mapM818a = eh2.m818a(jSONObject.getJSONObject("attestationArgs"));
                mapM818a.put("version", string2);
                AbstractC0647fd.m5677o(bk1.f1224b.f1225a.getApplicationContext(), string, new C0310ra(mapM818a));
            } catch (Exception e) {
                Log.e("OMIDLIB", "Error processing attestation request", e);
            }
        }
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: b */
    public boolean mo3790b(mt2 mt2Var) {
        return false;
    }

    @Override // p000.w81
    /* JADX INFO: renamed from: d */
    public Object mo5607d(String str, Provider provider) {
        return provider == null ? KeyPairGenerator.getInstance(str) : KeyPairGenerator.getInstance(str, provider);
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: e */
    public int mo3791e() {
        return 8;
    }

    @Override // p000.we1
    /* JADX INFO: renamed from: f */
    public String mo3001f() {
        return null;
    }

    @Override // p000.sz4
    /* JADX INFO: renamed from: g */
    public List mo5608g() {
        return null;
    }

    @Override // p000.ai3
    public Object get() {
        ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
        bu3 bu3Var = new bu3((byte) 0);
        bu3Var.f15636b = executorServiceNewSingleThreadExecutor;
        VarHandle.storeStoreFence();
        return bu3Var;
    }

    @Override // p000.sz4
    public Long getMaxTimePerTaskInUiThreadMillis() {
        return null;
    }

    @Override // p000.sz4
    public Long getTotalTimeInUiThreadMillis() {
        return null;
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: h */
    public boolean mo4279h(mt2 mt2Var) {
        return C0006a5.m88z(ks5.m7605f(sc6.m10652X(mt2Var), false));
    }

    @Override // p000.f44
    /* JADX INFO: renamed from: i */
    public c44 mo5505i(q50 q50Var, JSONObject jSONObject) {
        return m5597s(q50Var);
    }

    @Override // p000.ja0
    /* JADX INFO: renamed from: j */
    public long mo5609j() {
        return SystemClock.elapsedRealtime();
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: k */
    public void mo3792k(wf2 wf2Var, long j, qw1 qw1Var, int i, boolean z) {
        C0940nb c0940nb = wf2Var.f33299G;
        e13 e13Var = (e13) c0940nb.f25608e;
        kr2 kr2Var = e13.f17595X;
        ((e13) c0940nb.f25608e).m4877f1(e13.f17601d0, e13Var.m4867V0(j, true), qw1Var, 1, z);
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: l */
    public boolean mo3793l(qw1 qw1Var, wf2 wf2Var) {
        return false;
    }

    @Override // p000.le4
    /* JADX INFO: renamed from: n */
    public nr6 mo3146n(Object obj) {
        return y62.m12936B(Boolean.TRUE);
    }

    @Override // p000.d13
    /* JADX INFO: renamed from: o */
    public boolean mo3794o(wf2 wf2Var) {
        e14 e14VarM12297x = wf2Var.m12297x();
        boolean z = false;
        if (e14VarM12297x != null && e14VarM12297x.f17634d) {
            z = true;
        }
        return !z;
    }

    @Override // p000.sz4
    /* JADX INFO: renamed from: p */
    public List mo5610p() {
        return null;
    }

    @Override // p000.ad2
    /* JADX INFO: renamed from: q */
    public oc2 mo204q(KeyEvent keyEvent) {
        int iM3822s = c20.m3822s(keyEvent);
        if (iM3822s == 10) {
            if (nc2.m8689a(i20.m6579d(keyEvent.getKeyCode()), nc2.f25661o)) {
                return oc2.REDO;
            }
            return null;
        }
        if (iM3822s == 2) {
            long jM6579d = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d, nc2.f25656j) || nc2.m8689a(jM6579d, nc2.f25670x) || nc2.m8689a(jM6579d, nc2.f25645N)) {
                return oc2.COPY;
            }
            if (nc2.m8689a(jM6579d, nc2.f25658l)) {
                return oc2.PASTE;
            }
            if (nc2.m8689a(jM6579d, nc2.f25659m)) {
                return oc2.CUT;
            }
            if (nc2.m8689a(jM6579d, nc2.f25655i)) {
                return oc2.SELECT_ALL;
            }
            if (nc2.m8689a(jM6579d, nc2.f25660n)) {
                return oc2.REDO;
            }
            if (nc2.m8689a(jM6579d, nc2.f25661o)) {
                return oc2.UNDO;
            }
            return null;
        }
        if (iM3822s == 8) {
            long jM6579d2 = i20.m6579d(keyEvent.getKeyCode());
            if (nc2.m8689a(jM6579d2, nc2.f25652f) || nc2.m8689a(jM6579d2, nc2.f25639H)) {
                return oc2.SELECT_LEFT_CHAR;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25653g) || nc2.m8689a(jM6579d2, nc2.f25640I)) {
                return oc2.SELECT_RIGHT_CHAR;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25650d) || nc2.m8689a(jM6579d2, nc2.f25637F)) {
                return oc2.SELECT_UP;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25651e) || nc2.m8689a(jM6579d2, nc2.f25638G)) {
                return oc2.SELECT_DOWN;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25634C) || nc2.m8689a(jM6579d2, nc2.f25643L)) {
                return oc2.SELECT_PAGE_UP;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25635D) || nc2.m8689a(jM6579d2, nc2.f25644M)) {
                return oc2.SELECT_PAGE_DOWN;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25668v) || nc2.m8689a(jM6579d2, nc2.f25641J)) {
                return oc2.SELECT_LINE_START;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25669w) || nc2.m8689a(jM6579d2, nc2.f25642K)) {
                return oc2.SELECT_LINE_END;
            }
            if (nc2.m8689a(jM6579d2, nc2.f25670x) || nc2.m8689a(jM6579d2, nc2.f25645N)) {
                return oc2.PASTE;
            }
            return null;
        }
        if (iM3822s != 0) {
            return null;
        }
        long jM6579d3 = i20.m6579d(keyEvent.getKeyCode());
        if (nc2.m8689a(jM6579d3, nc2.f25652f) || nc2.m8689a(jM6579d3, nc2.f25639H)) {
            return oc2.LEFT_CHAR;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25653g) || nc2.m8689a(jM6579d3, nc2.f25640I)) {
            return oc2.RIGHT_CHAR;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25650d) || nc2.m8689a(jM6579d3, nc2.f25637F)) {
            return oc2.UP;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25651e) || nc2.m8689a(jM6579d3, nc2.f25638G)) {
            return oc2.DOWN;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25654h)) {
            return oc2.CENTER;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25634C) || nc2.m8689a(jM6579d3, nc2.f25643L)) {
            return oc2.PAGE_UP;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25635D) || nc2.m8689a(jM6579d3, nc2.f25644M)) {
            return oc2.PAGE_DOWN;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25668v) || nc2.m8689a(jM6579d3, nc2.f25641J)) {
            return oc2.LINE_START;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25669w) || nc2.m8689a(jM6579d3, nc2.f25642K)) {
            return oc2.LINE_END;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25664r) || nc2.m8689a(jM6579d3, nc2.f25636E)) {
            return oc2.NEW_LINE;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25665s)) {
            return oc2.DELETE_PREV_CHAR;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25666t)) {
            return oc2.DELETE_NEXT_CHAR;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25632A)) {
            return oc2.PASTE;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25671y)) {
            return oc2.CUT;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25672z)) {
            return oc2.COPY;
        }
        if (nc2.m8689a(jM6579d3, nc2.f25662p)) {
            return oc2.TAB;
        }
        return null;
    }

    public String toString() {
        switch (this.f18797a) {
            case 16:
                int iHashCode = hashCode();
                y62.m12992v(16);
                return zi4.m13622v("CreationExtras.Key@", Integer.toString(iHashCode, 16), "<", rl3.m10361a(av3.class).m10249b(), ">");
            case 17:
            default:
                return super.toString();
            case 18:
                return "SharingStarted.Lazily";
        }
    }

    @Override // p000.qi5
    /* JADX INFO: renamed from: b */
    public void mo1285b() {
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public byte mo2970a(da4 da4Var, int i) {
        return da4Var.m672a(i);
    }

    @Override // p000.t65
    /* JADX INFO: renamed from: a */
    public Object mo5605a(int i) {
        a31 a31Var = i != 0 ? null : a31.f341b;
        return a31Var == null ? a31.f342c : a31Var;
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public da4 mo2971a(da4 da4Var, int i, int i2) {
        byte[] bArr;
        if (i >= 0 && i <= i2) {
            byte[] bArr2 = da4Var.f2451a;
            if (i2 <= bArr2.length) {
                if (i > i2 || i2 > bArr2.length) {
                    throw new IndexOutOfBoundsException();
                }
                int i3 = i2 - i;
                if (i3 == 0) {
                    bArr = new byte[0];
                } else {
                    byte[] bArr3 = new byte[i3];
                    System.arraycopy(bArr2, i, bArr3, 0, i3);
                    bArr = bArr3;
                }
                return new da4(bArr);
            }
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // p000.af5
    /* JADX INFO: renamed from: a */
    public af5 mo2972a() {
        return new f70((byte) 28);
    }

    @Override // p000.qi5
    /* JADX INFO: renamed from: a */
    public String mo1282a() {
        return "omidJsAttestationListener";
    }

    @Override // p000.q54
    /* JADX INFO: renamed from: a */
    public si1 mo5606a(je4 je4Var) {
        vt0 vt0Var = new vt0((byte) 3);
        vt0Var.f32851b = je4Var;
        VarHandle.storeStoreFence();
        return vt0Var;
    }

    @Override // p000.we1
    /* JADX INFO: renamed from: c */
    public void mo3000c() {
    }

    @Override // p000.we1
    /* JADX INFO: renamed from: m */
    public void mo3002m(String str, long j) {
    }
}

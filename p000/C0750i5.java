package p000;

import android.content.Context;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Typeface;
import androidx.compose.p001ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: i5 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0750i5 implements oq1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f21128a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f21129b;

    public /* synthetic */ C0750i5(byte b) {
        this.f21128a = b;
    }

    @Override // p000.oq1
    /* JADX INFO: renamed from: g */
    public final Object mo183g(Object obj, Object obj2, Object obj3, Object obj4) {
        Object obj5;
        byte b = this.f21128a;
        xn2 xn2Var = null;
        byte b2 = 5;
        ju4 ju4Var = ju4.f22634a;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        Object obj6 = this.f21129b;
        switch (b) {
            case 0:
                nt2 nt2Var = (nt2) obj6;
                l73 l73Var = (l73) obj2;
                ((Integer) obj4).getClass();
                String str = (String) l73Var.f23833a;
                C0516c6 c0516c6 = (C0516c6) l73Var.f23834b;
                ir1 ir1Var = (ir1) ((mi0) obj3);
                Object objM6869O = ir1Var.m6869O();
                i50 i50Var = ki0.f23136a;
                Object obj7 = objM6869O;
                if (objM6869O == i50Var) {
                    d83 d83VarM7398w = k43.m7398w(Boolean.TRUE);
                    ir1Var.m6905n0(d83VarM7398w);
                    obj7 = d83VarM7398w;
                }
                sw2 sw2Var = (sw2) obj7;
                xb4 xb4VarM8766b = AbstractC0947ni.m8766b(((Boolean) sw2Var.getValue()).booleanValue() ? 0.0f : 1.0f, ((lq2) ir1Var.m6898k(pq2.f27894b)).f24280d.mo7286c(), ir1Var);
                C0861l6 c0861l6 = (C0861l6) ir1Var.m6898k(AbstractC0935n6.f25472a);
                xn2 xn2Var2 = (xn2) ir1Var.m6898k(yn2.f35357b);
                if (xn2Var2 == null) {
                    ir1Var.m6885d0(-1476823888);
                    ir1Var.m6912r(false);
                } else {
                    ir1Var.m6885d0(-1476823887);
                    boolean zM6890g = ir1Var.m6890g("AdBanner") | ir1Var.m6890g(xn2Var2);
                    Object objM6869O2 = ir1Var.m6869O();
                    if (zM6890g || objM6869O2 == i50Var) {
                        obj5 = objM6869O2;
                        xn2 xn2VarM12723c = xn2Var2.m12723c("AdBanner");
                        ir1Var.m6905n0(xn2VarM12723c);
                        obj5 = xn2VarM12723c;
                    }
                    xn2Var = (xn2) obj5;
                    ir1Var.m6912r(false);
                }
                Object objM6869O3 = ir1Var.m6869O();
                Object obj8 = objM6869O3;
                if (objM6869O3 == i50Var) {
                    zo0 zo0VarM7942w = lb5.m7942w(r71.f29063a, ir1Var);
                    ir1Var.m6905n0(zo0VarM7942w);
                    obj8 = zo0VarM7942w;
                }
                zo0 zo0Var = (zo0) obj8;
                nt2 nt2VarM8574b = n74.m8574b(nt2Var, 1.0f);
                ir1Var.m6885d0(-1183248572);
                float fMo3586w0 = ((ky0) ir1Var.m6898k(ij0.f21473h)).mo3586w0(C0516c6.m3850a((Context) ir1Var.m6898k(AndroidCompositionLocals_androidKt.f14651b), c0516c6.f15823b));
                ir1Var.m6912r(false);
                nt2 nt2VarM8575c = n74.m8575c(nt2VarM8574b, fMo3586w0);
                boolean zM6890g2 = ir1Var.m6890g(xb4VarM8766b);
                Object objM6869O4 = ir1Var.m6869O();
                Object obj9 = objM6869O4;
                if (zM6890g2 || objM6869O4 == i50Var) {
                    C0676g5 c0676g5 = new C0676g5(z2 ? 1 : 0);
                    c0676g5.f19614b = xb4VarM8766b;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0676g5);
                    obj9 = c0676g5;
                }
                nt2 nt2VarM10693F = se0.m10693F(nt2VarM8575c, (yp1) obj9);
                boolean zM6890g3 = ir1Var.m6890g(zo0Var) | ir1Var.m6890g(c0861l6) | ir1Var.m6890g(str) | ir1Var.m6894i(c0516c6) | ir1Var.m6894i(xn2Var);
                Object objM6869O5 = ir1Var.m6869O();
                Object obj10 = objM6869O5;
                if (zM6890g3 || objM6869O5 == i50Var) {
                    C0786j5 c0786j5 = new C0786j5(z3 ? 1 : 0);
                    c0786j5.f22019b = zo0Var;
                    c0786j5.f22020c = c0861l6;
                    c0786j5.f22021d = str;
                    c0786j5.f22022e = c0516c6;
                    c0786j5.f22023f = sw2Var;
                    c0786j5.f22024g = xn2Var;
                    VarHandle.storeStoreFence();
                    ir1Var.m6905n0(c0786j5);
                    obj10 = c0786j5;
                }
                yp1 yp1Var = (yp1) obj10;
                Object objM6869O6 = ir1Var.m6869O();
                Object obj11 = objM6869O6;
                if (objM6869O6 == i50Var) {
                    C0891m c0891m = new C0891m(b2);
                    ir1Var.m6905n0(c0891m);
                    obj11 = c0891m;
                }
                zp0.m13669a(yp1Var, nt2VarM10693F, (yp1) obj11, null, ir1Var, 3072);
                return ju4Var;
            case 1:
                C0452af c0452af = (C0452af) obj6;
                is4 is4VarM4044b = ((cm1) c0452af.f14420d).m4044b((bm1) obj, (xm1) obj2, ((tm1) obj3).f31237a, ((um1) obj4).f31990a);
                if (is4VarM4044b instanceof hs4) {
                    return (Typeface) ((hs4) is4VarM4044b).f20830a;
                }
                tt2 tt2Var = c0452af.f14425i;
                tt2 tt2Var2 = new tt2((byte) 15, z);
                tt2Var2.f31428b = is4VarM4044b;
                tt2Var2.f31429c = tt2Var;
                Object value = is4VarM4044b.getValue();
                tt2Var2.f31430d = value;
                VarHandle.storeStoreFence();
                c0452af.f14425i = tt2Var2;
                return (Typeface) value;
            case 2:
                String str2 = (String) obj6;
                mi0 mi0Var = (mi0) obj3;
                int iIntValue = ((Integer) obj4).intValue();
                ir1 ir1Var2 = (ir1) mi0Var;
                if (ir1Var2.m6871T(iIntValue & 1, (iIntValue & 129) != 128)) {
                    c20.m3806a(new C0532cm(str2, false), null, ir1Var2, 48, 4092);
                } else {
                    ir1Var2.m6874W();
                }
                return ju4Var;
            case 3:
                yp1 yp1Var2 = (yp1) obj6;
                g12 g12Var = (g12) obj2;
                mi0 mi0Var2 = (mi0) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= ((ir1) mi0Var2).m6890g(g12Var) ? 32 : 16;
                }
                ir1 ir1Var3 = (ir1) mi0Var2;
                if (ir1Var3.m6871T(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    l02.m7759a(g12Var, (nt2) yp1Var2.invoke(g12Var), 0L, ir1Var3, ((iIntValue2 >> 3) & 14) | 48, 8);
                } else {
                    ir1Var3.m6874W();
                }
                return ju4Var;
            case 4:
                SQLiteCursorDriver sQLiteCursorDriver = (SQLiteCursorDriver) obj2;
                String str3 = (String) obj3;
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                ap1 ap1Var = new ap1(sQLiteQuery);
                ef4 ef4Var = (ef4) ((wd3) obj6).f33259b;
                int length = ef4Var.f18052d.length;
                for (int i = 1; i < length; i++) {
                    int i2 = ef4Var.f18052d[i];
                    if (i2 == 1) {
                        ap1Var.mo3107z(i, ef4Var.f18053e[i]);
                    } else if (i2 == 2) {
                        ap1Var.mo3106o(i, ef4Var.f18054f[i]);
                    } else if (i2 == 3) {
                        ap1Var.mo3104h(i, ef4Var.f18055g[i]);
                    } else if (i2 == 4) {
                        ap1Var.mo3103E(i, ef4Var.f18056h[i]);
                    } else if (i2 == 5) {
                        ap1Var.mo3105m(i);
                    }
                }
                return new SQLiteCursor(sQLiteCursorDriver, str3, sQLiteQuery);
            default:
                pg0 pg0Var = (pg0) obj6;
                sg2 sg2Var = (sg2) obj;
                ((Integer) obj2).getClass();
                mi0 mi0Var3 = (mi0) obj3;
                int iIntValue3 = ((Integer) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((ir1) mi0Var3).m6890g(sg2Var) ? 4 : 2;
                }
                ir1 ir1Var4 = (ir1) mi0Var3;
                if (ir1Var4.m6871T(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    pg0Var.invoke(sg2Var, ir1Var4, Integer.valueOf(iIntValue3 & 14));
                } else {
                    ir1Var4.m6874W();
                }
                return ju4Var;
        }
    }
}

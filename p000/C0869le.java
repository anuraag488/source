package p000;

import android.graphics.Paint;
import android.os.VibrationEffect;
import android.view.View;
import android.view.WindowManager;
import java.lang.invoke.VarHandle;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: le */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0869le implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f23967a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f23968b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f23969c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f23970d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f23971e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f23972f;

    public /* synthetic */ C0869le(byte b) {
        this.f23967a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        float fM10674o;
        byte b = this.f23967a;
        byte b2 = 3;
        ju4 ju4Var = ju4.f22634a;
        byte b3 = 1;
        switch (b) {
            case 0:
                xk4 xk4Var = (xk4) this.f23968b;
                C1068qe c1068qe = (C1068qe) this.f23969c;
                l12 l12Var = (l12) this.f23970d;
                bh4 bh4Var = (bh4) this.f23971e;
                yp1 yp1Var = (yp1) this.f23972f;
                vj2 vj2Var = (vj2) obj;
                ej2 ej2Var = c1068qe.f28401a;
                vj2Var.f32675h = xk4Var;
                vj2Var.f32676i = l12Var;
                vj2Var.f32670c = bh4Var;
                vj2Var.f32671d = yp1Var;
                vj2Var.f32672e = ej2Var != null ? ej2Var.f18140p : null;
                vj2Var.f32673f = ej2Var != null ? ej2Var.f18141q : null;
                vj2Var.f32674g = ej2Var != null ? (fy4) sj3.m10825u(ej2Var, ij0.f21485t) : null;
                return ju4Var;
            case 1:
                cd3 cd3Var = (cd3) this.f23968b;
                wp1 wp1Var = (wp1) this.f23969c;
                ed3 ed3Var = (ed3) this.f23970d;
                String str = (String) this.f23971e;
                df2 df2Var = (df2) this.f23972f;
                cd3Var.f15950p.addView(cd3Var, cd3Var.f15951q);
                cd3Var.m3980n(wp1Var, ed3Var, str, df2Var);
                C1032pf c1032pf = new C1032pf((byte) 0);
                c1032pf.f27570b = cd3Var;
                VarHandle.storeStoreFence();
                return c1032pf;
            case 2:
                List list = (List) this.f23968b;
                yp1 yp1Var2 = (yp1) this.f23972f;
                List list2 = (List) this.f23969c;
                sw2 sw2Var = (sw2) this.f23970d;
                sw2 sw2Var2 = (sw2) this.f23971e;
                int size = list.size();
                C1143sf c1143sf = new C1143sf(b2);
                c1143sf.f30223b = list;
                VarHandle.storeStoreFence();
                ac0 ac0Var = new ac0();
                ac0Var.f237a = list;
                ac0Var.f238b = yp1Var2;
                ac0Var.f239c = list2;
                ac0Var.f240d = sw2Var;
                ac0Var.f241e = sw2Var2;
                VarHandle.storeStoreFence();
                ((vg2) obj).mo5716d(size, c1143sf, new pg0(2039820996, true, ac0Var));
                return ju4Var;
            case 3:
                Object obj2 = this.f23968b;
                Set set = (Set) this.f23969c;
                Set set2 = (Set) this.f23970d;
                sw2 sw2Var3 = (sw2) this.f23971e;
                sw2 sw2Var4 = (sw2) this.f23972f;
                kv0 kv0Var = new kv0((byte) 0);
                kv0Var.f23531c = obj2;
                kv0Var.f23532d = set;
                kv0Var.f23533e = set2;
                kv0Var.f23530b = sw2Var3;
                kv0Var.f23534f = sw2Var4;
                VarHandle.storeStoreFence();
                return kv0Var;
            case 4:
                yp1 yp1Var3 = (yp1) this.f23972f;
                ma0 ma0Var = (ma0) this.f23968b;
                yp1 yp1Var4 = (yp1) this.f23969c;
                kv1 kv1Var = (kv1) this.f23970d;
                sw2 sw2Var5 = (sw2) this.f23971e;
                float fFloatValue = ((Float) obj).floatValue();
                float f = ma0Var.f24778a;
                float f2 = ma0Var.f24779b;
                float f3 = f2 - f;
                int iIntValue = ((Number) yp1Var3.invoke(ma0Var)).intValue();
                if (iIntValue <= 0) {
                    fM10674o = sc6.m10674o(fFloatValue, f, f2);
                } else {
                    int i = iIntValue + 1;
                    float f4 = f3 / i;
                    float fM10675p = (sc6.m10675p(qq2.m10010E((fFloatValue - f) / f4), 0, i) * f4) + f;
                    double dPow = Math.pow(10.0d, Math.max(0, ((int) Math.ceil(-Math.log10(f4))) + 1));
                    fM10674o = sc6.m10674o((float) (Math.rint(((double) fM10675p) * dPow) / dPow), f, f2);
                }
                sw2Var5.setValue(Float.valueOf(fM10674o));
                if (yp1Var4 != null) {
                    yp1Var4.invoke(Float.valueOf(fM10674o));
                }
                float f5 = ma0Var.f24778a;
                float f6 = f2 - f5;
                float fM10674o2 = sc6.m10674o(f6 == 0.0f ? 1.0f : (fM10674o - f5) / f6, 0.0f, 1.0f);
                lv1 lv1Var = kv1Var.f23536b;
                float fM10674o3 = sc6.m10674o(fM10674o2, 0.0f, 1.0f);
                Float f7 = kv1Var.f23535a;
                kv1Var.f23535a = Float.valueOf(fM10674o3);
                if (f7 == null || f7.floatValue() != fM10674o3) {
                    if (fM10674o3 <= 0.0f || fM10674o3 >= 1.0f) {
                        if (lv1Var != null) {
                            lv1Var.m8115a(new dv1(Collections.singletonList(new ev1(1, 0.0f, 6, 0)), VibrationEffect.createPredefined(2)));
                        }
                    } else if ((f7 == null || qq2.m10010E(f7.floatValue() / 0.02f) != qq2.m10010E(fM10674o3 / 0.02f)) && lv1Var != null) {
                        lv1Var.m8115a(new dv1(Collections.singletonList(new ev1(8, (0.15f * fM10674o3) + 0.1f, 4, 0)), VibrationEffect.createOneShot((long) ((3.0f * fM10674o3) + 1.0f), qq2.m10010E(fM10674o3 * 10.0f) + 2)));
                    }
                }
                return ju4Var;
            case 5:
                ru2 ru2Var = (ru2) this.f23968b;
                ql3 ql3Var = (ql3) this.f23969c;
                nl3 nl3Var = (nl3) this.f23970d;
                vy3 vy3Var = (vy3) this.f23971e;
                ml3 ml3Var = (ml3) this.f23972f;
                float fFloatValue2 = ((Float) obj).floatValue();
                nu2 nu2VarM10439g = ru2.m10439g(ru2Var.f29640g);
                if (nu2VarM10439g != null) {
                    nh3 nh3Var = ru2Var.f26288e;
                    long j = nu2VarM10439g.f26094b;
                    long j2 = nu2VarM10439g.f26093a;
                    ((lx4) nh3Var.f25810b).m8145a(j, Float.intBitsToFloat((int) (j2 >> 32)));
                    ((lx4) nh3Var.f25811c).m8145a(j, Float.intBitsToFloat((int) (j2 & 4294967295L)));
                    nu2 nu2VarM8850a = ((nu2) ql3Var.f28555a).m8850a(nu2VarM10439g);
                    ql3Var.f28555a = nu2VarM8850a;
                    float fM12037j = vy3Var.m12037j(vy3Var.m12033f(nu2VarM8850a.f26093a));
                    nl3Var.f25933a = fM12037j;
                    ml3Var.f25002a = !y70.m13007H(fM12037j - fFloatValue2);
                }
                return Boolean.valueOf(nu2VarM10439g != null);
            case 6:
                vg4 vg4Var = (vg4) this.f23968b;
                View view = (View) this.f23969c;
                zg4 zg4Var = (zg4) this.f23970d;
                WindowManager windowManager = (WindowManager) this.f23971e;
                sw2 sw2Var6 = (sw2) this.f23972f;
                kv0 kv0Var2 = new kv0(b3);
                kv0Var2.f23531c = vg4Var;
                kv0Var2.f23532d = view;
                kv0Var2.f23533e = zg4Var;
                kv0Var2.f23534f = windowManager;
                kv0Var2.f23530b = sw2Var6;
                VarHandle.storeStoreFence();
                return kv0Var2;
            default:
                es0 es0Var = (es0) this.f23969c;
                vi3 vi3Var = (vi3) this.f23970d;
                xk4 xk4Var2 = (xk4) this.f23968b;
                uj2 uj2Var = (uj2) this.f23971e;
                ga4 ga4Var = (ga4) this.f23972f;
                yf2 yf2Var = (yf2) obj;
                yf2Var.m13113a();
                j70 j70Var = yf2Var.f35194a;
                float fM13399h = es0Var.f18429c.m13399h();
                if (fM13399h != 0.0f) {
                    long j3 = xk4Var2.f34342b;
                    int i2 = ql4.f28557c;
                    int i3 = (int) (j3 >> 32);
                    vi3Var.m11898a(i3);
                    kl4 kl4VarM11577d = uj2Var.m11577d();
                    jl3 jl3VarM7177c = kl4VarM11577d != null ? kl4VarM11577d.f23216a.m7177c(i3) : new jl3(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(yf2Var.mo3575E(2.0f));
                    float f8 = fFloor >= 1.0f ? fFloor : 1.0f;
                    float f9 = f8 / 2.0f;
                    float f10 = jl3VarM7177c.f22396a + f9;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (j70Var.mo11227d() >> 32)) - f9;
                    if (f10 > fIntBitsToFloat) {
                        f10 = fIntBitsToFloat;
                    }
                    if (f10 >= f9) {
                        f9 = f10;
                    }
                    float fFloor2 = ((int) f8) % 2 == 1 ? ((float) Math.floor(f9)) + 0.5f : (float) Math.rint(f9);
                    long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(jl3VarM7177c.f22397b)) & 4294967295L);
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fFloor2)) << 32) | (((long) Float.floatToRawIntBits(jl3VarM7177c.f22399d)) & 4294967295L);
                    h70 h70Var = j70Var.f22063a.f21148c;
                    C1253ve c1253veM3810e = j70Var.f22066d;
                    if (c1253veM3810e == null) {
                        c1253veM3810e = c20.m3810e();
                        c1253veM3810e.m11885o(1);
                        j70Var.f22066d = c1253veM3810e;
                    }
                    Paint paint = (Paint) c1253veM3810e.f32549b;
                    ga4Var.mo5948a(fM13399h, j70Var.mo11227d(), c1253veM3810e);
                    if (!z62.m13387o((o00) c1253veM3810e.f32551d, null)) {
                        c1253veM3810e.m11882l(null);
                    }
                    if (c1253veM3810e.f32548a != 3) {
                        c1253veM3810e.m11880j(3);
                    }
                    if (paint.getStrokeWidth() != f8) {
                        paint.setStrokeWidth(f8);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (c1253veM3810e.m11877g() != 0) {
                        c1253veM3810e.m11883m(0);
                    }
                    if (c1253veM3810e.m11878h() != 0) {
                        c1253veM3810e.m11884n(0);
                    }
                    if (!paint.isFilterBitmap()) {
                        paint.setFilterBitmap(true);
                    }
                    h70Var.mo6254k(jFloatToRawIntBits, jFloatToRawIntBits2, c1253veM3810e);
                }
                return ju4Var;
        }
    }
}

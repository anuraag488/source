package p000;

import android.os.Trace;
import androidx.work.Worker;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ag */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0453ag implements yp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f14442a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ boolean f14443b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f14444c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f14445d;

    /* JADX INFO: renamed from: e */
    public /* synthetic */ Object f14446e;

    public /* synthetic */ C0453ag(byte b) {
        this.f14442a = b;
    }

    @Override // p000.yp1
    public final Object invoke(Object obj) {
        byte b = this.f14442a;
        byte b2 = 1;
        wm0 wm0Var = null;
        ju4 ju4Var = ju4.f22634a;
        switch (b) {
            case 0:
                wp1 wp1Var = (wp1) this.f14444c;
                boolean z = this.f14443b;
                t02 t02Var = (t02) this.f14445d;
                o00 o00Var = (o00) this.f14446e;
                yf2 yf2Var = (yf2) obj;
                yf2Var.m13113a();
                j70 j70Var = yf2Var.f35194a;
                if (((Boolean) wp1Var.invoke()).booleanValue()) {
                    if (z) {
                        long jMo11226a0 = j70Var.mo11226a0();
                        jp0 jp0Var = j70Var.f22064b;
                        long jM7219E = jp0Var.m7219E();
                        jp0Var.m7248w().mo6253j();
                        try {
                            ((ar3) jp0Var.f22481b).m3155y(-1.0f, 1.0f, jMo11226a0);
                            u31.m11223o(yf2Var, t02Var, o00Var);
                        } finally {
                            d55.m4374s(jp0Var, jM7219E);
                        }
                    } else {
                        u31.m11223o(yf2Var, t02Var, o00Var);
                    }
                }
                return ju4Var;
            case 1:
                u93 u93Var = (u93) this.f14444c;
                yp1 yp1Var = (yp1) this.f14445d;
                boolean z2 = this.f14443b;
                C0950nl c0950nl = (C0950nl) this.f14446e;
                z10 z10Var = new z10(b2);
                z10Var.f35693c = u93Var;
                z10Var.f35694d = yp1Var;
                z10Var.f35692b = z2;
                z10Var.f35695e = c0950nl;
                VarHandle.storeStoreFence();
                ((kz3) obj).m7753a(null, new pg0(-1050634624, true, z10Var));
                return ju4Var;
            case 2:
                sw2 sw2Var = (sw2) this.f14444c;
                ArrayList arrayList = (ArrayList) this.f14445d;
                List list = (List) this.f14446e;
                boolean z3 = this.f14443b;
                cb3 cb3Var = (cb3) obj;
                cb3Var.f15915a = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((ni2) arrayList.get(i)).m8777d(cb3Var, z3);
                }
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ni2) list.get(i2)).m8777d(cb3Var, z3);
                }
                cb3Var.f15915a = false;
                sw2Var.getValue();
                return ju4Var;
            case 3:
                boolean z4 = this.f14443b;
                zo0 zo0Var = (zo0) this.f14445d;
                d64 d64Var = (d64) this.f14446e;
                wp1 wp1Var2 = (wp1) this.f14444c;
                if (z4) {
                    t82 t82VarM7910S = lb5.m7910S(zo0Var, null, null, new t10(d64Var, wm0Var, (byte) 7), 3);
                    l10 l10Var = new l10((byte) 2);
                    l10Var.f23692b = d64Var;
                    l10Var.f23693c = wp1Var2;
                    VarHandle.storeStoreFence();
                    ((e92) t82VarM7910S).mo4972C(l10Var);
                }
                return ju4Var;
            case 4:
                boolean z5 = this.f14443b;
                k84 k84Var = (k84) this.f14445d;
                yp1 yp1Var2 = (yp1) this.f14446e;
                wp1 wp1Var3 = (wp1) this.f14444c;
                q14 q14Var = (q14) obj;
                if (!z5) {
                    ic2[] ic2VarArr = o14.f26289a;
                    q14Var.mo4898a(m14.f24561j, ju4Var);
                }
                String strValueOf = String.valueOf(qq2.m10010E(k84Var.f22987b.m13399h() * 100.0f) / 100.0f);
                ic2[] ic2VarArr2 = o14.f26289a;
                p14 p14Var = m14.f24553b;
                ic2 ic2Var = o14.f26289a[0];
                p14Var.getClass();
                q14Var.mo4898a(p14Var, strValueOf);
                C1164t c1164t = new C1164t((byte) 28);
                c1164t.f30700c = k84Var;
                c1164t.f30699b = yp1Var2;
                c1164t.f30701d = wp1Var3;
                VarHandle.storeStoreFence();
                q14Var.mo4898a(d14.f16712i, new C1353y2(null, c1164t));
                return ju4Var;
            case 5:
                C0910mi c0910mi = (C0910mi) this.f14444c;
                boolean z6 = this.f14443b;
                a83 a83Var = (a83) this.f14445d;
                sw2 sw2Var2 = (sw2) this.f14446e;
                yf2 yf2Var2 = (yf2) obj;
                float fFloatValue = ((Number) c0910mi.m8328d()).floatValue();
                j70 j70Var2 = yf2Var2.f35194a;
                j70 j70Var3 = yf2Var2.f35194a;
                ((ar3) j70Var2.f22064b.f22481b).m3130A(fFloatValue, 0.0f);
                try {
                    yf2Var2.m13113a();
                    ((ar3) j70Var3.f22064b.f22481b).m3130A(-fFloatValue, -0.0f);
                    if (z6) {
                        float fFloatValue2 = ((Number) sw2Var2.getValue()).floatValue() + fFloatValue + a83Var.m132h();
                        ((ar3) j70Var3.f22064b.f22481b).m3130A(fFloatValue2, 0.0f);
                        try {
                            yf2Var2.m13113a();
                        } finally {
                            ((ar3) j70Var3.f22064b.f22481b).m3130A(-fFloatValue2, -0.0f);
                        }
                    }
                    return ju4Var;
                } catch (Throwable th) {
                    ((ar3) j70Var3.f22064b.f22481b).m3130A(-fFloatValue, -0.0f);
                    throw th;
                }
            default:
                Worker worker = (Worker) this.f14444c;
                boolean z7 = this.f14443b;
                String strSubstring = (String) this.f14445d;
                h35 h35Var = (h35) this.f14446e;
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof y25) {
                    worker.f14682c.compareAndSet(-256, ((y25) th2).f34826a);
                }
                if (z7 && strSubstring != null) {
                    r50 r50Var = h35Var.f20345e.f21515l;
                    int iHashCode = h35Var.f20341a.hashCode();
                    r50Var.getClass();
                    if (strSubstring.length() > 127) {
                        strSubstring = strSubstring.substring(0, 127);
                    }
                    Trace.endAsyncSection(strSubstring, iHashCode);
                }
                return ju4Var;
        }
    }
}

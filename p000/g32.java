package p000;

import android.app.RemoteAction;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import androidx.work.impl.WorkDatabase_Impl;
import java.lang.invoke.VarHandle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g32 implements wp1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f19557a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f19558b;

    public /* synthetic */ g32(byte b) {
        this.f19557a = b;
    }

    /* JADX WARN: Code duplicated, block: B:232:0x010d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0103  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107 A[Catch: all -> 0x011b, LOOP:4: B:48:0x00d4->B:59:0x0107, LOOP_END, TryCatch #3 {all -> 0x011b, blocks: (B:45:0x00c0, B:48:0x00d4, B:50:0x00e2, B:52:0x00ec, B:54:0x00f2, B:55:0x00fb, B:59:0x0107, B:60:0x010d), top: B:222:0x00c0 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [int] */
    @Override // p000.wp1
    public final Object invoke() {
        zi0 zi0Var;
        char c;
        boolean z;
        long j;
        long j2 = -9187201950435737472L;
        char c2 = 7;
        boolean z2 = true;
        boolean z3 = false;
        switch (this.f19557a) {
            case 0:
                return Float.valueOf(qs5.m10076A(((zo0) this.f19558b).mo6367f()));
            case 1:
                return (InputMethodManager) ((View) ((jp0) this.f19558b).f22481b).getContext().getSystemService("input_method");
            case 2:
                return (InputMethodManager) ((View) ((z32) this.f19558b).f35738b).getContext().getSystemService("input_method");
            case 3:
                WorkDatabase_Impl workDatabase_Impl = ((n72) this.f19558b).f25490a;
                return Boolean.valueOf(!workDatabase_Impl.m3068k() || workDatabase_Impl.m3071n());
            case 4:
                cg2 cg2Var = (cg2) this.f19558b;
                if (!((Boolean) cg2Var.f16003g.getValue()).booleanValue() && (zi0Var = cg2Var.f15999c) != null) {
                    zi0Var.m13585p();
                }
                return ju4.f22634a;
            case 5:
                r01 r01Var = ((jh2) this.f19558b).f22281j;
                if (r01Var != null) {
                    z62.m13348G(r01Var);
                }
                return ju4.f22634a;
            case 6:
                return new BaseInputConnection(((vj2) this.f19558b).f32668a, false);
            case 7:
                s92 s92Var = (s92) ((rk2) this.f19558b).f29370a.f33090b;
                if (!s92Var.f30010c) {
                    if (s92Var.f30011d) {
                        ld3.m7957a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    s92Var.m10564a();
                    s92Var.f30011d = true;
                }
                return ju4.f22634a;
            case 8:
                return (rn2) this.f19558b;
            case 9:
                ot2 ot2Var = (ot2) this.f19558b;
                ot2Var.f27089f = false;
                HashSet hashSet = new HashSet();
                cw2 cw2Var = ot2Var.f27087d;
                if (cw2Var != null) {
                    Object[] objArr = cw2Var.f16532a;
                    int i = cw2Var.f16533b;
                    for (int i2 = 0; i2 < i; i2++) {
                        wf2 wf2Var = (wf2) objArr[i2];
                        cw2 cw2Var2 = ot2Var.f27088e;
                        if (cw2Var2 == null) {
                            cw2Var2 = new cw2();
                            ot2Var.f27088e = cw2Var2;
                        }
                        yh3 yh3Var = (yh3) cw2Var2.m4206g(i2);
                        mt2 mt2Var = (mt2) wf2Var.f33299G.f25610g;
                        if (mt2Var.f25208n) {
                            ot2.m9265b(mt2Var, yh3Var);
                        }
                    }
                    cw2Var.m4203d();
                    cw2 cw2Var3 = ot2Var.f27088e;
                    if (cw2Var3 != null) {
                        cw2Var3.m4203d();
                    }
                }
                cw2 cw2Var4 = ot2Var.f27085b;
                if (cw2Var4 != null) {
                    Object[] objArr2 = cw2Var4.f16532a;
                    int i3 = cw2Var4.f16533b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        C1271vw c1271vw = (C1271vw) objArr2[i4];
                        cw2 cw2Var5 = ot2Var.f27086c;
                        if (cw2Var5 == null) {
                            cw2Var5 = new cw2();
                            ot2Var.f27086c = cw2Var5;
                        }
                        yh3 yh3Var2 = (yh3) cw2Var5.m4206g(i4);
                        if (c1271vw.f25208n) {
                            ot2.m9265b(c1271vw, yh3Var2);
                        }
                    }
                    cw2Var4.m4203d();
                    cw2 cw2Var6 = ot2Var.f27086c;
                    if (cw2Var6 != null) {
                        cw2Var6.m4203d();
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    ((C1271vw) it.next()).m12000Q0();
                }
                return ju4.f22634a;
            case 10:
                return ((g03) this.f19558b).f19469d;
            case 11:
                return ((k03) this.f19558b).m7352O0();
            case 12:
                kr2 kr2Var = new kr2((byte) 20);
                VarHandle.storeStoreFence();
                return sc6.m10669j("kotlin.Unit", rd4.f29191m, new g24[0], kr2Var);
            case 13:
                t33 t33Var = (t33) this.f19558b;
                r33 r33Var = new r33();
                byte b = 14;
                C1040pn c1040pn = new C1040pn(b);
                c1040pn.f27754b = t33Var;
                VarHandle.storeStoreFence();
                C1283w7 c1283w7 = new C1283w7(b);
                c1283w7.f33127c = c1040pn;
                jz2 jz2Var = new jz2();
                jz2Var.f22753a = bc4.m3547a(lz2.f24483a);
                ac4 ac4VarM3547a = bc4.m3547a(new gz2());
                jz2Var.f22754b = ac4VarM3547a;
                jz2Var.f22755c = new xj3(ac4VarM3547a, null);
                jz2Var.f22756d = new C0461ao();
                jz2Var.f22757e = new C0461ao();
                jz2Var.f22761i = c63.m3856a();
                jz2Var.f22762j = c63.m3856a();
                jz2Var.f22763k = c63.m3856a();
                VarHandle.storeStoreFence();
                c1283w7.f33128d = jz2Var;
                c63.m3856a();
                c1283w7.f33129e = c63.m3856a();
                c1283w7.f33126b = c63.m3856a();
                VarHandle.storeStoreFence();
                c1283w7.m12137g(r33Var);
                r33Var.f28978c = c1283w7;
                VarHandle.storeStoreFence();
                return r33Var;
            case 14:
                return Boolean.valueOf(cd3.m3975l((cd3) this.f19558b));
            case 15:
                return ((ye3) this.f19558b).mo9873f();
            case 16:
                ll3 ll3Var = (ll3) this.f19558b;
                ll3Var.f24134i = null;
                Trace.beginSection("OnPositionedDispatch");
                try {
                    ll3Var.m8027a();
                    return ju4.f22634a;
                } finally {
                    Trace.endSection();
                }
            case 17:
                fu3 fu3Var = (fu3) this.f19558b;
                dv3 dv3Var = fu3Var.f19321a;
                Object obj = fu3Var.f19324d;
                if (obj != null) {
                    return dv3Var.mo4750k(fu3Var, obj);
                }
                C1077qn.m9987m("Value should be initialized");
                return null;
            case 18:
                pq3 pq3Var = ((pu3) this.f19558b).f28012c;
                if (pq3Var == null) {
                    return null;
                }
                Bundle bundleM7742x = kx5.m7742x((l73[]) Arrays.copyOf(new l73[0], 0));
                pq3Var.m9609g(bundleM7742x);
                if (bundleM7742x.isEmpty()) {
                    return null;
                }
                return bundleM7742x;
            case 19:
                return tu3.m11163c((py4) this.f19558b);
            case 20:
                av3 av3Var = (av3) this.f19558b;
                gk2 lifecycle = av3Var.getLifecycle();
                il3 il3Var = new il3((byte) 0);
                il3Var.f21532b = av3Var;
                VarHandle.storeStoreFence();
                lifecycle.mo6015a(il3Var);
                return ju4.f22634a;
            case 21:
                yx3 yx3Var = (yx3) this.f19558b;
                C1327xd c1327xd = (C1327xd) sj3.m10825u(yx3Var, n63.f25473a);
                yx3Var.f35588A = c1327xd;
                yx3Var.f35589B = c1327xd != null ? c1327xd.m12663a() : null;
                return ju4.f22634a;
            case 22:
                yz3 yz3Var = (yz3) this.f19558b;
                dp4 dp4Var = yz3Var.f35654i;
                yz3Var.f35655j = dp4Var != null ? ((Number) dp4Var.f17270m.getValue()).longValue() : 0L;
                return ju4.f22634a;
            case 23:
                return (ViewParent) this.f19558b;
            case 24:
                i24 i24Var = (i24) this.f19558b;
                return Integer.valueOf(AbstractC0647fd.m5643A(i24Var, i24Var.f21074k));
            case 25:
                l44 l44Var = (l44) this.f19558b;
                d83 d83Var = l44Var.f23785c;
                if (((h74) d83Var.getValue()).f20418a == 9205357640488583168L || h74.m6274f(((h74) d83Var.getValue()).f20418a)) {
                    return null;
                }
                u30 u30Var = l44Var.f23783a;
                long j3 = ((h74) d83Var.getValue()).f20418a;
                return u30Var.f31634c;
            case 26:
                wz2 wz2Var = (wz2) this.f19558b;
                wz2Var.f33874b.m9690b(wz2Var.f33875c, null);
                return ju4.f22634a;
            case 27:
                long j4 = 128;
                aa4 aa4Var = (aa4) this.f19558b;
                while (true) {
                    synchronized (aa4Var.f216g) {
                        try {
                            if (aa4Var.f212c) {
                                c = c2;
                            } else {
                                aa4Var.f212c = z2;
                                try {
                                    uw2 uw2Var = aa4Var.f215f;
                                    Object[] objArr3 = uw2Var.f32211a;
                                    int i5 = uw2Var.f32213c;
                                    for (?? r4 = z3; r4 < i5; r4++) {
                                        try {
                                            z94 z94Var = (z94) objArr3[r4];
                                            mw2 mw2Var = z94Var.f35894g;
                                            yp1 yp1Var = z94Var.f35888a;
                                            Object[] objArr4 = mw2Var.f25258b;
                                            long[] jArr = mw2Var.f25257a;
                                            int length = jArr.length - 2;
                                            char c3 = c2;
                                            if (length >= 0) {
                                                ?? r14 = z3;
                                                while (true) {
                                                    long j5 = jArr[r14];
                                                    int i6 = length;
                                                    if ((((~j5) << c3) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i7 = 8 - ((~(r14 - i6)) >>> 31);
                                                        int i8 = 0;
                                                        while (i8 < i7) {
                                                            if ((j5 & 255) < j4) {
                                                                yp1Var.invoke(objArr4[(r14 << 3) + i8]);
                                                            }
                                                            j5 >>= 8;
                                                            i8++;
                                                            j4 = 128;
                                                        }
                                                        if (i7 == 8) {
                                                            length = i6;
                                                            if (r14 != length) {
                                                                j4 = 128;
                                                                r14++;
                                                            }
                                                        }
                                                    } else {
                                                        length = i6;
                                                        if (r14 != length) {
                                                            j4 = 128;
                                                            r14++;
                                                        }
                                                    }
                                                }
                                            }
                                            mw2Var.m8410b();
                                            c2 = c3;
                                            z3 = false;
                                            j4 = 128;
                                        } catch (Throwable th) {
                                            th = th;
                                            z = false;
                                            aa4Var.f212c = z;
                                            throw th;
                                        }
                                    }
                                    c = c2;
                                    aa4Var.f212c = z3;
                                } catch (Throwable th2) {
                                    th = th2;
                                    z = z3;
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    if (!aa4Var.m157c()) {
                        return ju4.f22634a;
                    }
                    c2 = c;
                    z2 = true;
                    z3 = false;
                    j4 = 128;
                }
                break;
            case 28:
                jg2 jg2VarM5105a = ((ee4) this.f19558b).m5105a();
                wf2 wf2Var2 = jg2VarM5105a.f22230a;
                if (jg2VarM5105a.f22243n != ((uw2) ((aw2) wf2Var2.m12289p()).f14915b).f32213c) {
                    lw2 lw2Var = jg2VarM5105a.f22235f;
                    Object[] objArr5 = lw2Var.f24420c;
                    long[] jArr2 = lw2Var.f24418a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i9 = 0;
                        while (true) {
                            long j6 = jArr2[i9];
                            if ((((~j6) << 7) & j6 & j2) != j2) {
                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                int i11 = 0;
                                while (i11 < i10) {
                                    if ((j6 & 255) < 128) {
                                        ((cg2) objArr5[(i9 << 3) + i11]).f16000d = true;
                                    }
                                    j6 >>= 8;
                                    i11++;
                                    j2 = j2;
                                }
                                j = j2;
                                if (i10 == 8) {
                                }
                            } else {
                                j = j2;
                            }
                            if (i9 != length2) {
                                i9++;
                                j2 = j;
                            }
                        }
                    }
                    if (wf2Var2.f33319i != null) {
                        if (!wf2Var2.f33300H.f14472e) {
                            wf2.m12244V(wf2Var2, false, 7);
                        }
                    } else if (!wf2Var2.m12291r()) {
                        wf2.m12245X(wf2Var2, false, 7);
                    }
                }
                return ju4.f22634a;
            default:
                qq2.m10012G(((RemoteAction) this.f19558b).getActionIntent());
                return ju4.f22634a;
        }
    }
}

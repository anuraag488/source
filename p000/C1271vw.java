package p000;

import android.os.SystemClock;
import android.view.MotionEvent;
import java.lang.invoke.VarHandle;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: renamed from: vw */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class C1271vw extends mt2 implements lf2, s31, g14, oc3, pt2, g83, af2, ns1, nk1, hl1, ll1, s63, o40 {

    /* JADX INFO: renamed from: o */
    public lt2 f32893o;

    /* JADX INFO: renamed from: p */
    public C1234uw f32894p;

    /* JADX INFO: renamed from: q */
    public HashSet f32895q;

    @Override // p000.ns1
    /* JADX INFO: renamed from: B */
    public final void mo43B(e13 e13Var) {
        throw new ClassCastException();
    }

    @Override // p000.s63
    /* JADX INFO: renamed from: F */
    public final boolean mo3599F() {
        return this.f25208n;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        m11998O0(true);
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        m11999P0();
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: I */
    public final int mo4192I(so2 so2Var, sq2 sq2Var, int i) {
        return ((jf2) this.f32893o).mo6529e(new e72(so2Var, so2Var.getLayoutDirection()), new fw0(sq2Var, ir2.f21711a, jr2.f22541b, (byte) 1), ll0.m8010b(0, i, 0, 0, 13)).mo4504d();
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: N */
    public final void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        C1283w7 c1283w7 = ((rc3) this.f32893o).f29153d;
        rc3 rc3Var = (rc3) c1283w7.f33126b;
        List list = ec3Var.f18000a;
        List list2 = list;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            }
            lc3 lc3Var = (lc3) list.get(i);
            if (AbstractC1356y5.m12921o(lc3Var) || AbstractC1356y5.m12923q(lc3Var)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list2.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size2) {
                z2 = true;
                break;
            } else {
                if (((lc3) list.get(i2)).m7954c()) {
                    z2 = false;
                    break;
                }
                i2++;
            }
        }
        if (rc3Var.f29152c) {
            z3 = true;
            break;
        }
        int size3 = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size3) {
                if (!z2) {
                    z3 = false;
                    break;
                }
                break;
            } else {
                lc3 lc3Var2 = (lc3) list.get(i3);
                if (!AbstractC1356y5.m12921o(lc3Var2) && !AbstractC1356y5.m12923q(lc3Var2)) {
                    i3++;
                }
            }
            z3 = true;
            break;
        }
        if (((qc3) c1283w7.f33128d) != qc3.f28385c) {
            if (fc3Var == fc3.f18903a && z3) {
                c1283w7.f33129e = ec3Var;
                c1283w7.m12149y(ec3Var, !z || rc3Var.f29152c);
            }
            if (fc3Var == fc3.f18904b && z && ec3Var == ((ec3) c1283w7.f33129e) && rc3Var.f29152c) {
                int size4 = list2.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((lc3) list.get(i4)).m7952a();
                }
            }
            if (fc3Var == fc3.f18905c && !z3 && ec3Var != ((ec3) c1283w7.f33129e)) {
                c1283w7.m12149y(ec3Var, true);
            }
        }
        if (fc3Var == fc3.f18905c) {
            int size5 = list2.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size5) {
                    c1283w7.f33128d = qc3.f28383a;
                    ((rc3) c1283w7.f33126b).f29152c = false;
                    c1283w7.f33129e = null;
                    break;
                } else if (!AbstractC1356y5.m12923q((lc3) list.get(i5))) {
                    break;
                } else {
                    i5++;
                }
            }
            if (ec3Var == ((ec3) c1283w7.f33129e) && z) {
                int size6 = list2.size();
                for (int i6 = 0; i6 < size6; i6++) {
                    if (((lc3) list.get(i6)).m7954c()) {
                        if (rc3Var.f29152c) {
                            break;
                        }
                        c1283w7.m12131R(ec3Var);
                        return;
                    }
                }
                int size7 = list2.size();
                for (int i7 = 0; i7 < size7; i7++) {
                    ((lc3) list.get(i7)).m7952a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final void m11998O0(boolean z) {
        if (!this.f25208n) {
            q32.m9721c("initializeModifier called on unattached node");
        }
        lt2 lt2Var = this.f32893o;
        if ((this.f25197c & 32) != 0 && (lt2Var instanceof qt2)) {
            qt2 qt2Var = (qt2) lt2Var;
            yh3 yh3Var = sj3.f30333c;
            C1234uw c1234uw = this.f32894p;
            if (c1234uw == null || !c1234uw.mo6633o(yh3Var)) {
                C1234uw c1234uw2 = new C1234uw();
                c1234uw2.f32210j = qt2Var;
                this.f32894p = c1234uw2;
                if (((vh4) sc6.m10652X(this).f33299G.f25609f).f32624o) {
                    ot2 modifierLocalManager = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getModifierLocalManager();
                    cw2 cw2Var = modifierLocalManager.f27085b;
                    if (cw2Var == null) {
                        cw2Var = new cw2();
                        modifierLocalManager.f27085b = cw2Var;
                    }
                    cw2Var.m4200a(this);
                    cw2 cw2Var2 = modifierLocalManager.f27086c;
                    if (cw2Var2 == null) {
                        cw2Var2 = new cw2();
                        modifierLocalManager.f27086c = cw2Var2;
                    }
                    cw2Var2.m4200a(yh3Var);
                    modifierLocalManager.m9266a();
                }
            } else {
                c1234uw.f32210j = qt2Var;
                ot2 modifierLocalManager2 = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getModifierLocalManager();
                cw2 cw2Var3 = modifierLocalManager2.f27085b;
                if (cw2Var3 == null) {
                    cw2Var3 = new cw2();
                    modifierLocalManager2.f27085b = cw2Var3;
                }
                cw2Var3.m4200a(this);
                cw2 cw2Var4 = modifierLocalManager2.f27086c;
                if (cw2Var4 == null) {
                    cw2Var4 = new cw2();
                    modifierLocalManager2.f27086c = cw2Var4;
                }
                cw2Var4.m4200a(yh3Var);
                modifierLocalManager2.m9266a();
            }
        }
        if ((this.f25197c & 4) != 0 && !z) {
            sc6.m10650V(this, 2).m4879h1();
        }
        if ((this.f25197c & 2) != 0) {
            if (((vh4) sc6.m10652X(this).f33299G.f25609f).f32624o) {
                e13 e13Var = this.f25202h;
                ((of2) e13Var).m9057D1(this);
                q63 q63Var = e13Var.f17623V;
                if (q63Var != null) {
                    ((du1) q63Var).m4735c();
                }
            }
            if (!z) {
                sc6.m10650V(this, 2).m4879h1();
                sc6.m10652X(this).m12253G();
            }
        }
        if (lt2Var instanceof pi2) {
            ((pi2) lt2Var).f27635a.f30305k = sc6.m10652X(this);
        }
        int i = this.f25197c;
        if ((i & 16) != 0 && (lt2Var instanceof rc3)) {
            ((rc3) lt2Var).f29153d.f33127c = this.f25202h;
        }
        if ((i & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).m10626z();
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m11999P0() {
        if (!this.f25208n) {
            q32.m9721c("unInitializeModifier called on unattached node");
        }
        lt2 lt2Var = this.f32893o;
        if ((this.f25197c & 32) != 0 && (lt2Var instanceof qt2)) {
            ot2 modifierLocalManager = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getModifierLocalManager();
            yh3 yh3Var = sj3.f30333c;
            cw2 cw2Var = modifierLocalManager.f27087d;
            if (cw2Var == null) {
                cw2Var = new cw2();
                modifierLocalManager.f27087d = cw2Var;
            }
            cw2Var.m4200a(sc6.m10652X(this));
            cw2 cw2Var2 = modifierLocalManager.f27088e;
            if (cw2Var2 == null) {
                cw2Var2 = new cw2();
                modifierLocalManager.f27088e = cw2Var2;
            }
            cw2Var2.m4200a(yh3Var);
            modifierLocalManager.m9266a();
        }
        if ((this.f25197c & 8) != 0) {
            ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).m10626z();
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m12000Q0() {
        if (this.f25208n) {
            this.f32895q.clear();
            u63 snapshotObserver = ((ViewTreeObserverOnGlobalLayoutListenerC1140sc) sc6.m10653Y(this)).getSnapshotObserver();
            C0499bp c0499bp = i25.f21076a;
            C0515c5 c0515c5 = new C0515c5((byte) 19);
            VarHandle.storeStoreFence();
            snapshotObserver.f31675a.m159e(this, c0499bp, c0515c5);
        }
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: S */
    public final void mo3550S(yf2 yf2Var) {
        throw null;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: V */
    public final int mo5819V(so2 so2Var, sq2 sq2Var, int i) {
        return ((jf2) this.f32893o).mo6529e(new e72(so2Var, so2Var.getLayoutDirection()), new fw0(sq2Var, ir2.f21711a, jr2.f22540a, (byte) 1), ll0.m8010b(0, 0, 0, i, 7)).mo4506g();
    }

    @Override // p000.hl1
    /* JADX INFO: renamed from: W */
    public final void mo6426W(cl1 cl1Var) {
        lt2 lt2Var = this.f32893o;
        q32.m9721c("applyFocusProperties called on wrong node");
        lt2Var.getClass();
        throw new ClassCastException();
    }

    @Override // p000.nk1
    /* JADX INFO: renamed from: Y */
    public final void mo7995Y(nl1 nl1Var) {
        lt2 lt2Var = this.f32893o;
        q32.m9721c("onFocusEvent called on wrong node");
        lt2Var.getClass();
        throw new ClassCastException();
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: a */
    public final void mo4197a() {
        if (this.f32893o instanceof rc3) {
            mo8143j0();
        }
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: b0 */
    public final boolean mo9034b0() {
        ((rc3) this.f32893o).f29153d.getClass();
        return true;
    }

    @Override // p000.o40
    /* JADX INFO: renamed from: c */
    public final ky0 mo8939c() {
        return sc6.m10652X(this).f33336z;
    }

    @Override // p000.o40
    /* JADX INFO: renamed from: d */
    public final long mo8940d() {
        return z62.m13369a0(sc6.m10650V(this, 128).f16901c);
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        return ((jf2) this.f32893o).mo6529e(zq2Var, sq2Var, j);
    }

    @Override // p000.o40
    public final df2 getLayoutDirection() {
        return sc6.m10652X(this).f33293A;
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: h */
    public final int mo5820h(so2 so2Var, sq2 sq2Var, int i) {
        return ((jf2) this.f32893o).mo6529e(new e72(so2Var, so2Var.getLayoutDirection()), new fw0(sq2Var, ir2.f21712b, jr2.f22540a, (byte) 1), ll0.m8010b(0, 0, 0, i, 7)).mo4506g();
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        C0497bn c0497bn = (C0497bn) this.f32893o;
        e14 e14Var = new e14();
        e14Var.f17633c = c0497bn.f15424a;
        c0497bn.f15425b.invoke(e14Var);
        e14 e14Var2 = (e14) q14Var;
        lw2 lw2Var = e14Var2.f17631a;
        if (e14Var.f17633c) {
            e14Var2.f17633c = true;
        }
        if (e14Var.f17634d) {
            e14Var2.f17634d = true;
        }
        lw2 lw2Var2 = e14Var.f17631a;
        Object[] objArr = lw2Var2.f24419b;
        Object[] objArr2 = lw2Var2.f24420c;
        long[] jArr = lw2Var2.f24418a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        p14 p14Var = (p14) obj;
                        if (!lw2Var.m8127b(p14Var)) {
                            lw2Var.m8138m(p14Var, obj2);
                        } else if (obj2 instanceof C1353y2) {
                            C1353y2 c1353y2 = (C1353y2) lw2Var.m8132g(p14Var);
                            String str = c1353y2.f34817a;
                            if (str == null) {
                                str = ((C1353y2) obj2).f34817a;
                            }
                            iq1 iq1Var = c1353y2.f34818b;
                            if (iq1Var == null) {
                                iq1Var = ((C1353y2) obj2).f34818b;
                            }
                            lw2Var.m8138m(p14Var, new C1353y2(str, iq1Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: j0 */
    public final void mo8143j0() {
        C1283w7 c1283w7 = ((rc3) this.f32893o).f29153d;
        qc3 qc3Var = (qc3) c1283w7.f33128d;
        rc3 rc3Var = (rc3) c1283w7.f33126b;
        if (qc3Var == qc3.f28384b) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            ((C1256vh) rc3Var.m10293c()).invoke(motionEventObtain);
            motionEventObtain.recycle();
            c1283w7.f33128d = qc3.f28383a;
            rc3Var.f29152c = false;
            c1283w7.f33129e = null;
        }
    }

    @Override // p000.pt2
    /* JADX INFO: renamed from: l */
    public final i25 mo9667l() {
        C1234uw c1234uw = this.f32894p;
        return c1234uw != null ? c1234uw : x71.f34035j;
    }

    @Override // p000.g83
    /* JADX INFO: renamed from: q0 */
    public final Object mo5931q0(Object obj) {
        return (C0529cj) this.f32893o;
    }

    @Override // p000.s31
    /* JADX INFO: renamed from: r0 */
    public final void mo10513r0() {
        z62.m13348G(this);
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: t0 */
    public final void mo9036t0() {
        ((rc3) this.f32893o).f29153d.getClass();
    }

    public final String toString() {
        return this.f32893o.toString();
    }

    @Override // p000.lf2
    /* JADX INFO: renamed from: u */
    public final int mo4198u(so2 so2Var, sq2 sq2Var, int i) {
        return ((jf2) this.f32893o).mo6529e(new e72(so2Var, so2Var.getLayoutDirection()), new fw0(sq2Var, ir2.f21712b, jr2.f22541b, (byte) 1), ll0.m8010b(0, i, 0, 0, 13)).mo4504d();
    }

    @Override // p000.af2, p000.cr2
    /* JADX INFO: renamed from: b */
    public final void mo2964b(long j) {
    }

    @Override // p000.af2
    /* JADX INFO: renamed from: v */
    public final void mo2965v(cf2 cf2Var) {
    }
}

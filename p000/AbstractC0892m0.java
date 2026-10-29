package p000;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.invoke.VarHandle;

/* JADX INFO: renamed from: m0 */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0892m0 extends qx0 implements oc3, wc2, g14, bj0, y23, a32, as1 {

    /* JADX INFO: renamed from: A */
    public String f24490A = "idle";

    /* JADX INFO: renamed from: B */
    public px0 f24491B;

    /* JADX INFO: renamed from: C */
    public ff3 f24492C;

    /* JADX INFO: renamed from: D */
    public mx1 f24493D;

    /* JADX INFO: renamed from: E */
    public final sv2 f24494E;

    /* JADX INFO: renamed from: F */
    public long f24495F;

    /* JADX INFO: renamed from: G */
    public ff3 f24496G;

    /* JADX INFO: renamed from: H */
    public nv2 f24497H;

    /* JADX INFO: renamed from: I */
    public boolean f24498I;

    /* JADX INFO: renamed from: J */
    public t82 f24499J;

    /* JADX INFO: renamed from: q */
    public nv2 f24500q;

    /* JADX INFO: renamed from: r */
    public q22 f24501r;

    /* JADX INFO: renamed from: s */
    public boolean f24502s;

    /* JADX INFO: renamed from: t */
    public String f24503t;

    /* JADX INFO: renamed from: u */
    public lq3 f24504u;

    /* JADX INFO: renamed from: v */
    public boolean f24505v;

    /* JADX INFO: renamed from: w */
    public wp1 f24506w;

    /* JADX INFO: renamed from: x */
    public final xl1 f24507x;

    /* JADX INFO: renamed from: y */
    public q22 f24508y;

    /* JADX INFO: renamed from: z */
    public bs1 f24509z;

    public AbstractC0892m0(nv2 nv2Var, q22 q22Var, boolean z, boolean z2, String str, lq3 lq3Var, wp1 wp1Var) {
        this.f24500q = nv2Var;
        this.f24501r = q22Var;
        this.f24502s = z;
        this.f24503t = str;
        this.f24504u = lq3Var;
        this.f24505v = z2;
        this.f24506w = wp1Var;
        this.f24507x = new xl1(nv2Var, 0, new C0633f0(1, this, AbstractC0892m0.class, "onFocusChange", "onFocusChange(Z)V", 0, (byte) 0));
        int i = do2.f17236a;
        this.f24494E = new sv2(6);
        this.f24495F = 0L;
        nv2 nv2Var2 = this.f24500q;
        this.f24497H = nv2Var2;
        this.f24498I = nv2Var2 == null;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: D0 */
    public final boolean mo4191D0() {
        return false;
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        mo4194P();
        if (!this.f24498I) {
            m8163Z0();
        }
        if (this.f24505v) {
            m10154O0(this.f24507x);
        }
    }

    @Override // p000.mt2
    /* JADX INFO: renamed from: H0 */
    public final void mo27H0() {
        m8157T0();
        if (this.f24497H == null) {
            this.f24500q = null;
        }
        px0 px0Var = this.f24491B;
        if (px0Var != null) {
            m10155P0(px0Var);
        }
        this.f24491B = null;
        bs1 bs1Var = this.f24509z;
        if (bs1Var != null) {
            m10155P0(bs1Var);
        }
        this.f24509z = null;
    }

    @Override // p000.oc3
    /* JADX INFO: renamed from: N */
    public void mo6964N(ec3 ec3Var, fc3 fc3Var, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.f24495F = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        m8163Z0();
        if (this.f24505v) {
            if (this.f24509z == null) {
                bs1 bs1Var = new bs1();
                bs1Var.f15546o = this;
                VarHandle.storeStoreFence();
                m10154O0(bs1Var);
                this.f24509z = bs1Var;
            }
            if (fc3Var == fc3.f18904b) {
                int i = ec3Var.f18005f;
                wm0 wm0Var = null;
                if (i == 4) {
                    lb5.m7910S(m8391C0(), null, null, new C0855l0(this, wm0Var, (byte) 0), 3);
                } else if (i == 5) {
                    lb5.m7910S(m8391C0(), null, null, new C0855l0(this, wm0Var, (byte) 1), 3);
                }
            }
        }
    }

    @Override // p000.y23
    /* JADX INFO: renamed from: P */
    public final void mo4194P() {
        if (this.f24502s) {
            C0510c0 c0510c0 = new C0510c0((byte) 0);
            c0510c0.f15721b = this;
            VarHandle.storeStoreFence();
            c20.m3797B(this, c0510c0);
        }
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m8156S0() {
        ql3 ql3Var = new ql3();
        C0607ec c0607ec = new C0607ec((byte) 1);
        c0607ec.f17957b = ql3Var;
        VarHandle.storeStoreFence();
        C0797jg c0797jg = new C0797jg((byte) 6);
        c0797jg.f22228b = c0607ec;
        VarHandle.storeStoreFence();
        dt0.m4695X(this, bs1.f15545p, c0797jg);
        if (ql3Var.f28555a == null) {
            int i = aa0.f203b;
            ViewParent parent = zc6.m13511H(this).getParent();
            while (parent != null && (parent instanceof ViewGroup)) {
                ViewGroup viewGroup = (ViewGroup) parent;
                if (!viewGroup.shouldDelayChildPressedState()) {
                    parent = viewGroup.getParent();
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:0: B:16:0x0037->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0076 A[EDGE_INSN: B:30:0x0076->B:27:0x0076 BREAK  A[LOOP:0: B:16:0x0037->B:26:0x0073], SYNTHETIC] */
    /* JADX INFO: renamed from: T0 */
    public final void m8157T0() {
        nv2 nv2Var = this.f24500q;
        sv2 sv2Var = this.f24494E;
        if (nv2Var != null) {
            ff3 ff3Var = this.f24492C;
            if (ff3Var != null) {
                nv2Var.m8861b(new ef3(ff3Var));
            }
            ff3 ff3Var2 = this.f24496G;
            if (ff3Var2 != null) {
                nv2Var.m8861b(new ef3(ff3Var2));
            }
            mx1 mx1Var = this.f24493D;
            if (mx1Var != null) {
                nv2Var.m8861b(new nx1(mx1Var));
            }
            Object[] objArr = sv2Var.f30591c;
            long[] jArr = sv2Var.f30589a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                nv2Var.m8861b(new ef3((ff3) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.f24492C = null;
        this.f24496G = null;
        this.f24493D = null;
        sv2Var.m10921a();
    }

    /* JADX INFO: renamed from: U0 */
    public final long m8158U0(long j) {
        long jMo3581c0 = sc6.m10652X(this).f33336z.mo3581c0(((fy4) sj3.m10825u(this, ij0.f21485t)).mo5862g());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jMo3581c0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jMo3581c0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    /* JADX INFO: renamed from: V0 */
    public final void m8159V0(boolean z) {
        w01 w01VarMo4972C;
        nv2 nv2Var = this.f24500q;
        if (nv2Var != null) {
            t82 t82Var = this.f24499J;
            wm0 wm0Var = null;
            if (t82Var == null || !t82Var.mo4995b()) {
                ff3 ff3Var = z ? this.f24496G : this.f24492C;
                if (ff3Var != null) {
                    ef3 ef3Var = new ef3(ff3Var);
                    t82 t82Var2 = (t82) ((um0) m8391C0()).f31989a.get(o85.f26448h);
                    if (t82Var2 != null) {
                        C0558d0 c0558d0 = new C0558d0((byte) 0);
                        c0558d0.f16655b = nv2Var;
                        c0558d0.f16656c = ef3Var;
                        VarHandle.storeStoreFence();
                        w01VarMo4972C = t82Var2.mo4972C(c0558d0);
                    } else {
                        w01VarMo4972C = null;
                    }
                    lb5.m7910S(m8391C0(), null, null, new C0671g0(nv2Var, ef3Var, w01VarMo4972C, wm0Var, (byte) 0), 3);
                }
            } else {
                t82 t82Var3 = this.f24499J;
                if (t82Var3 != null) {
                    t82Var3.mo4993a(null);
                }
            }
            if (z) {
                this.f24496G = null;
            } else {
                this.f24492C = null;
            }
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m8160W0(long j, boolean z) {
        nv2 nv2Var = this.f24500q;
        if (nv2Var != null) {
            t82 t82Var = this.f24499J;
            if (t82Var == null || !t82Var.mo4995b()) {
                ff3 ff3Var = z ? this.f24496G : this.f24492C;
                if (ff3Var != null) {
                    lb5.m7910S(m8391C0(), null, null, new C0745i0(ff3Var, nv2Var, null), 3);
                }
            } else {
                t82Var.mo4993a(null);
                lb5.m7910S(m8391C0(), null, null, new C0708h0(t82Var, j, nv2Var, (wm0) null), 3);
            }
            if (z) {
                this.f24496G = null;
            } else {
                this.f24492C = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p000.wc2
    /* JADX INFO: renamed from: X */
    public final boolean mo6965X(KeyEvent keyEvent) {
        boolean z;
        m8163Z0();
        long jM10079D = qs5.m10079D(keyEvent);
        boolean z2 = this.f24505v;
        byte b = 3;
        wm0 wm0Var = null;
        sv2 sv2Var = this.f24494E;
        if (z2) {
            byte b2 = 2;
            if (qs5.m10083H(keyEvent) == 2 && kx5.m7692W(keyEvent)) {
                if (sv2Var.m10922b(jM10079D)) {
                    z = false;
                } else {
                    ff3 ff3Var = new ff3(this.f24495F);
                    sv2Var.m10927g(jM10079D, ff3Var);
                    if (this.f24500q != null) {
                        lb5.m7910S(m8391C0(), null, null, new C0818k0(this, ff3Var, wm0Var, b2), 3);
                    }
                    z = true;
                }
                if (mo8165b1(keyEvent) || z) {
                    return true;
                }
                return false;
            }
        }
        if (this.f24505v && qs5.m10083H(keyEvent) == 1 && kx5.m7692W(keyEvent)) {
            ff3 ff3Var2 = (ff3) sv2Var.m10926f(jM10079D);
            if (ff3Var2 != null) {
                if (this.f24500q != null) {
                    lb5.m7910S(m8391C0(), null, null, new C0818k0(this, ff3Var2, wm0Var, b), 3);
                }
                mo8166c1(keyEvent);
            }
            if (ff3Var2 != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: X0 */
    public final void m8161X0(s22 s22Var) {
        nv2 nv2Var = this.f24500q;
        if (nv2Var != null) {
            ff3 ff3Var = new ff3(s22Var.f29833c);
            wm0 wm0Var = null;
            if (m8156S0()) {
                this.f24499J = lb5.m7910S(m8391C0(), null, null, new C0781j0(nv2Var, ff3Var, this, wm0Var, (byte) 0), 3);
            } else {
                this.f24496G = ff3Var;
                lb5.m7910S(m8391C0(), null, null, new C0745i0(nv2Var, ff3Var, wm0Var, (byte) 1), 3);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m8162Y0(lc3 lc3Var) {
        nv2 nv2Var = this.f24500q;
        if (nv2Var != null) {
            ff3 ff3Var = new ff3(lc3Var.f23937c);
            wm0 wm0Var = null;
            if (m8156S0()) {
                this.f24499J = lb5.m7910S(m8391C0(), null, null, new C0781j0(nv2Var, ff3Var, this, wm0Var, (byte) 1), 3);
            } else {
                this.f24492C = ff3Var;
                lb5.m7910S(m8391C0(), null, null, new C0745i0(nv2Var, ff3Var, wm0Var, (byte) 2), 3);
            }
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m8163Z0() {
        if (this.f24491B != null) {
            return;
        }
        q22 q22Var = this.f24502s ? this.f24508y : this.f24501r;
        if (q22Var != null) {
            nv2 nv2VarM10810f = this.f24500q;
            if (nv2VarM10810f == null) {
                nv2VarM10810f = sj3.m10810f();
                this.f24500q = nv2VarM10810f;
            }
            this.f24507x.m12707T0(nv2VarM10810f);
            px0 px0VarMo7265a = q22Var.mo7265a(this.f24500q);
            m10154O0(px0VarMo7265a);
            this.f24491B = px0VarMo7265a;
        }
    }

    /* JADX INFO: renamed from: b1 */
    public boolean mo8165b1(KeyEvent keyEvent) {
        return false;
    }

    /* JADX INFO: renamed from: c1 */
    public void mo8166c1(KeyEvent keyEvent) {
        m8167d1();
    }

    /* JADX INFO: renamed from: d1 */
    public final void m8167d1() {
        ia4 ia4Var = (ia4) sj3.m10825u(this, ij0.f21487v);
        if (ia4Var != null) {
            ia4Var.mo6007a();
        }
        this.f24506w.invoke();
    }

    /* JADX INFO: renamed from: e1 */
    public final void m8168e1(nv2 nv2Var, q22 q22Var, boolean z, boolean z2, String str, lq3 lq3Var, wp1 wp1Var) {
        boolean z3;
        boolean z4;
        px0 px0Var;
        boolean z5 = true;
        if (z62.m13387o(this.f24497H, nv2Var)) {
            z3 = false;
        } else {
            m8157T0();
            this.f24497H = nv2Var;
            this.f24500q = nv2Var;
            z3 = true;
        }
        if (!z62.m13387o(this.f24501r, q22Var)) {
            this.f24501r = q22Var;
            z3 = true;
        }
        if (this.f24502s != z) {
            this.f24502s = z;
            if (z) {
                mo4194P();
            }
            z3 = true;
        }
        boolean z6 = this.f24505v;
        xl1 xl1Var = this.f24507x;
        if (z6 != z2) {
            if (z2) {
                m10154O0(xl1Var);
            } else {
                m10155P0(xl1Var);
                m8157T0();
            }
            y70.m13004E(this);
            if (!z2) {
                px0 px0Var2 = this.f24509z;
                if (px0Var2 != null) {
                    m10155P0(px0Var2);
                }
                this.f24509z = null;
                this.f24490A = "idle";
            }
            this.f24505v = z2;
        }
        if (!z62.m13387o(this.f24503t, str)) {
            this.f24503t = str;
            y70.m13004E(this);
        }
        if (!z62.m13387o(this.f24504u, lq3Var)) {
            this.f24504u = lq3Var;
            y70.m13004E(this);
        }
        this.f24506w = wp1Var;
        boolean z7 = this.f24498I;
        nv2 nv2Var2 = this.f24497H;
        if (z7 == (nv2Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = nv2Var2 == null;
            this.f24498I = z4;
            if (z4 || this.f24491B != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((px0Var = this.f24491B) != null || !z4)) {
            if (px0Var != null) {
                m10155P0(px0Var);
            }
            this.f24491B = null;
            m8163Z0();
        }
        xl1Var.m12707T0(this.f24500q);
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: i0 */
    public final void mo4513i0(q14 q14Var) {
        lq3 lq3Var = this.f24504u;
        if (lq3Var != null) {
            o14.m8923d(q14Var, lq3Var.f24281a);
        }
        String str = this.f24503t;
        C0510c0 c0510c0 = new C0510c0((byte) 1);
        c0510c0.f15721b = this;
        VarHandle.storeStoreFence();
        ic2[] ic2VarArr = o14.f26289a;
        q14Var.mo4898a(d14.f16705b, new C1353y2(str, c0510c0));
        if (this.f24505v) {
            this.f24507x.mo4513i0(q14Var);
        } else {
            q14Var.mo4898a(m14.f24561j, ju4.f22634a);
        }
        mo7568R0(q14Var);
    }

    @Override // p000.wc2
    /* JADX INFO: renamed from: n */
    public final boolean mo6969n(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.g14
    /* JADX INFO: renamed from: n0 */
    public final boolean mo5883n0() {
        return true;
    }

    @Override // p000.as1
    /* JADX INFO: renamed from: v0 */
    public final String mo3221v0() {
        return this.f24490A;
    }

    /* JADX INFO: renamed from: R0 */
    public void mo7568R0(q14 q14Var) {
    }

    /* JADX INFO: renamed from: a1 */
    public void mo8164a1() {
    }
}

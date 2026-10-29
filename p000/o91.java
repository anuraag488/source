package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class o91 extends pf2 implements af2 {

    /* JADX INFO: renamed from: A */
    public n91 f26478A;

    /* JADX INFO: renamed from: o */
    public dp4 f26479o;

    /* JADX INFO: renamed from: p */
    public yo4 f26480p;

    /* JADX INFO: renamed from: q */
    public yo4 f26481q;

    /* JADX INFO: renamed from: r */
    public yo4 f26482r;

    /* JADX INFO: renamed from: s */
    public p91 f26483s;

    /* JADX INFO: renamed from: t */
    public mc1 f26484t;

    /* JADX INFO: renamed from: u */
    public b54 f26485u;

    /* JADX INFO: renamed from: v */
    public wp1 f26486v;

    /* JADX INFO: renamed from: w */
    public d91 f26487w;

    /* JADX INFO: renamed from: x */
    public long f26488x;

    /* JADX INFO: renamed from: y */
    public InterfaceC0520ca f26489y;

    /* JADX INFO: renamed from: z */
    public n91 f26490z;

    @Override // p000.mt2
    /* JADX INFO: renamed from: G0 */
    public final void mo26G0() {
        this.f26488x = -9223372034707292160L;
    }

    /* JADX INFO: renamed from: O0 */
    public final InterfaceC0520ca m9005O0() {
        InterfaceC0520ca interfaceC0520ca;
        InterfaceC0520ca interfaceC0520ca2;
        if (this.f26479o.m4645g().mo10251b(b91.f15168a, b91.f15169b)) {
            z70 z70Var = this.f26483s.f27464a.f16336c;
            if (z70Var != null && (interfaceC0520ca2 = z70Var.f35799a) != null) {
                return interfaceC0520ca2;
            }
            z70 z70Var2 = this.f26484t.f24813a.f16336c;
            if (z70Var2 != null) {
                return z70Var2.f35799a;
            }
            return null;
        }
        z70 z70Var3 = this.f26484t.f24813a.f16336c;
        if (z70Var3 != null && (interfaceC0520ca = z70Var3.f35799a) != null) {
            return interfaceC0520ca;
        }
        z70 z70Var4 = this.f26483s.f27464a.f16336c;
        if (z70Var4 != null) {
            return z70Var4.f35799a;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0107  */
    @Override // p000.lf2
    /* JADX INFO: renamed from: e */
    public final yq2 mo28e(zq2 zq2Var, sq2 sq2Var, long j) {
        xo4 xo4VarM13208a;
        xo4 xo4VarM13208a2;
        to4 to4VarM11080a;
        to4 to4Var;
        b54 b54Var;
        xo4 xo4VarM13208a3;
        long j2;
        long j3;
        xo4 xo4VarM13208a4;
        C0530ck c0530ck;
        C0494bk c0494bk;
        float fFloatValue;
        if (this.f26479o.f17258a.mo11188l() == this.f26479o.f17261d.getValue()) {
            this.f26489y = null;
        } else if (this.f26489y == null) {
            InterfaceC0520ca interfaceC0520caM9005O0 = m9005O0();
            if (interfaceC0520caM9005O0 == null) {
                interfaceC0520caM9005O0 = ig1.f21378b;
            }
            this.f26489y = interfaceC0520caM9005O0;
        }
        boolean zMo3587z = zq2Var.mo3587z();
        w71 w71Var = w71.f33134a;
        if (zMo3587z) {
            db3 db3VarMo5826e = sq2Var.mo5826e(j);
            long j4 = (((long) db3VarMo5826e.f16899a) << 32) | (((long) db3VarMo5826e.f16900b) & 4294967295L);
            this.f26488x = j4;
            return zq2Var.mo3583l0((int) (j4 >> 32), (int) (j4 & 4294967295L), w71Var, new C1036pj(db3VarMo5826e, (byte) 1));
        }
        if (!((Boolean) this.f26486v.invoke()).booleanValue()) {
            db3 db3VarMo5826e2 = sq2Var.mo5826e(j);
            return zq2Var.mo3583l0(db3VarMo5826e2.f16899a, db3VarMo5826e2.f16900b, w71Var, new C1036pj(db3VarMo5826e2, (byte) 2));
        }
        d91 d91Var = this.f26487w;
        yo4 yo4Var = d91Var.f16867a;
        b54 b54Var2 = d91Var.f16868b;
        yo4 yo4Var2 = d91Var.f16869c;
        dp4 dp4Var = d91Var.f16870d;
        p91 p91Var = d91Var.f16871e;
        cp4 cp4Var = p91Var.f27464a;
        mc1 mc1Var = d91Var.f16872f;
        yo4 yo4Var3 = d91Var.f16873g;
        if (yo4Var != null) {
            xo4VarM13208a = yo4Var.m13208a(new f91(p91Var, mc1Var, (byte) 0), b54Var2.m3456a() ? Float.valueOf(b54Var2.f15094f) : null, null, new g91(p91Var, mc1Var, b54Var2, (byte) 0));
        } else {
            xo4VarM13208a = null;
        }
        if (yo4Var2 != null) {
            f91 f91Var = new f91(p91Var, mc1Var, (byte) 1);
            Float fValueOf = b54Var2.m3456a() ? Float.valueOf(b54Var2.f15095g) : null;
            if (b54Var2.m3456a()) {
                lx4 lx4Var = b54Var2.f15098j;
                if (lx4Var != null) {
                    float fM8146b = lx4Var.m8146b();
                    Float fValueOf2 = Float.valueOf(fM8146b);
                    if (Float.isNaN(fM8146b)) {
                        fValueOf2 = null;
                    }
                    if (fValueOf2 != null) {
                        fFloatValue = fValueOf2.floatValue();
                    } else {
                        fFloatValue = 0.0f;
                    }
                } else {
                    fFloatValue = 0.0f;
                }
                c0494bk = new C0494bk(fFloatValue);
            } else {
                c0494bk = null;
            }
            xo4VarM13208a2 = yo4Var2.m13208a(f91Var, fValueOf, c0494bk, new g91(p91Var, mc1Var, b54Var2, (byte) 1));
        } else {
            xo4VarM13208a2 = null;
        }
        if (dp4Var.f17258a.mo11188l() == b91.f15168a) {
            rv3 rv3Var = cp4Var.f16337d;
            if (rv3Var == null && (rv3Var = mc1Var.f24813a.f16337d) == null) {
                to4Var = null;
            } else {
                to4VarM11080a = to4.m11080a(rv3Var.f29667b);
                to4Var = to4VarM11080a;
            }
        } else {
            rv3 rv3Var2 = mc1Var.f24813a.f16337d;
            if (rv3Var2 == null && (rv3Var2 = cp4Var.f16337d) == null) {
                to4Var = null;
            } else {
                to4VarM11080a = to4.m11080a(rv3Var2.f29667b);
                to4Var = to4VarM11080a;
            }
        }
        if (yo4Var3 != null) {
            C1035pi c1035pi = C1035pi.f27621s;
            to4 to4VarM11080a2 = b54Var2.m3456a() ? to4.m11080a(b54Var2.f15096h) : null;
            f31 f31Var = new f31(to4Var, p91Var, mc1Var, b54Var2, (byte) 3);
            b54Var = b54Var2;
            xo4VarM13208a3 = yo4Var3.m13208a(c1035pi, to4VarM11080a2, null, f31Var);
        } else {
            b54Var = b54Var2;
            xo4VarM13208a3 = null;
        }
        f31 f31Var2 = new f31(b54Var, xo4VarM13208a, xo4VarM13208a2, xo4VarM13208a3, (byte) 2);
        db3 db3VarMo5826e3 = sq2Var.mo5826e(j);
        long j5 = (((long) db3VarMo5826e3.f16899a) << 32) | (((long) db3VarMo5826e3.f16900b) & 4294967295L);
        long j6 = !w52.m12108c(this.f26488x, -9223372034707292160L) ? this.f26488x : j5;
        yo4 yo4Var4 = this.f26480p;
        xo4 xo4VarM13208a5 = yo4Var4 != null ? yo4Var4.m13208a(this.f26490z, null, null, new m91(this, j6, (byte) 0)) : null;
        long jM8012d = ll0.m8012d(j, xo4VarM13208a5 != null ? ((w52) xo4VarM13208a5.getValue()).f33109a : j5);
        yo4 yo4Var5 = this.f26481q;
        if (yo4Var5 != null) {
            j2 = 0;
            j3 = ((o52) yo4Var5.m13208a(C1035pi.f27624v, null, null, new m91(this, j6, (byte) 2)).getValue()).f26352a;
        } else {
            j2 = 0;
            j3 = 0;
        }
        yo4 yo4Var6 = this.f26482r;
        if (yo4Var6 != null) {
            n91 n91Var = this.f26478A;
            b54 b54Var3 = this.f26485u;
            o52 o52VarM8954a = b54Var3.m3456a() ? o52.m8954a(b54Var3.f15097i) : null;
            if (this.f26485u.m3456a()) {
                float fM7332c = jx4.m7332c(j2);
                Float fValueOf3 = Float.valueOf(fM7332c);
                if (Float.isNaN(fM7332c)) {
                    fValueOf3 = null;
                }
                float fFloatValue2 = fValueOf3 != null ? fValueOf3.floatValue() : 0.0f;
                float fM7333d = jx4.m7333d(j2);
                Float fValueOf4 = !Float.isNaN(fM7333d) ? Float.valueOf(fM7333d) : null;
                c0530ck = new C0530ck(fFloatValue2, fValueOf4 != null ? fValueOf4.floatValue() : 0.0f);
            } else {
                c0530ck = null;
            }
            xo4VarM13208a4 = yo4Var6.m13208a(n91Var, o52VarM8954a, c0530ck, new m91(this, j6, (byte) 1));
        } else {
            j5 = j5;
            jM8012d = jM8012d;
            xo4VarM13208a4 = null;
        }
        return zq2Var.mo3583l0((int) (jM8012d >> 32), (int) (jM8012d & 4294967295L), w71Var, new l91(this, xo4VarM13208a4, j5, j6, jM8012d, db3VarMo5826e3, j3, f31Var2));
    }

    @Override // p000.af2
    /* JADX INFO: renamed from: v */
    public final void mo2965v(cf2 cf2Var) {
        this.f26485u.getClass();
    }
}

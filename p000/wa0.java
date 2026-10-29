package p000;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class wa0 {

    /* JADX INFO: renamed from: a */
    public int f33187a;

    /* JADX INFO: renamed from: b */
    public int f33188b;

    /* JADX INFO: renamed from: c */
    public Object f33189c;

    /* JADX INFO: renamed from: A */
    public abstract void mo4112A(int i);

    /* JADX INFO: renamed from: B */
    public abstract void mo4113B(int i);

    /* JADX INFO: renamed from: C */
    public abstract boolean mo4114C();

    /* JADX INFO: renamed from: D */
    public abstract boolean mo4115D();

    /* JADX INFO: renamed from: E */
    public abstract boolean mo4116E(int i);

    /* JADX INFO: renamed from: F */
    public void m12172F() throws ss5 {
        if (this.f33187a + this.f33188b < 100) {
            return;
        }
        qm5.m9916g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: renamed from: G */
    public void m12173G() throws ss5 {
        boolean zMo4116E;
        do {
            int iMo4126Q = mo4126Q();
            if (iMo4126Q == 0) {
                return;
            }
            m12172F();
            this.f33188b++;
            zMo4116E = mo4116E(iMo4126Q);
            this.f33188b--;
        } while (zMo4116E);
    }

    /* JADX INFO: renamed from: H */
    public abstract double mo4117H();

    /* JADX INFO: renamed from: I */
    public abstract float mo4118I();

    /* JADX INFO: renamed from: J */
    public abstract int mo4119J();

    /* JADX INFO: renamed from: K */
    public abstract int mo4120K(int i);

    /* JADX INFO: renamed from: L */
    public abstract int mo4121L();

    /* JADX INFO: renamed from: M */
    public abstract int mo4122M();

    /* JADX INFO: renamed from: N */
    public abstract int mo4123N();

    /* JADX INFO: renamed from: O */
    public abstract int mo4124O();

    /* JADX INFO: renamed from: P */
    public abstract int mo4125P();

    /* JADX INFO: renamed from: Q */
    public abstract int mo4126Q();

    /* JADX INFO: renamed from: R */
    public abstract int mo4127R();

    /* JADX INFO: renamed from: S */
    public abstract long mo4128S();

    /* JADX INFO: renamed from: T */
    public abstract long mo4129T();

    /* JADX INFO: renamed from: U */
    public abstract long mo4130U();

    /* JADX INFO: renamed from: V */
    public abstract long mo4131V();

    /* JADX INFO: renamed from: W */
    public abstract long mo4132W();

    /* JADX INFO: renamed from: X */
    public abstract String mo4133X();

    /* JADX INFO: renamed from: Y */
    public abstract String mo4134Y();

    /* JADX INFO: renamed from: a */
    public abstract void mo11309a(int i);

    /* JADX INFO: renamed from: b */
    public abstract int mo11311b();

    /* JADX INFO: renamed from: c */
    public abstract boolean mo11313c();

    /* JADX INFO: renamed from: d */
    public abstract void mo11315d(int i);

    /* JADX INFO: renamed from: e */
    public abstract int mo11317e(int i);

    /* JADX INFO: renamed from: f */
    public abstract boolean mo11319f();

    /* JADX INFO: renamed from: g */
    public abstract p50 mo11321g();

    /* JADX INFO: renamed from: h */
    public abstract double mo11323h();

    /* JADX INFO: renamed from: i */
    public abstract int mo11324i();

    /* JADX INFO: renamed from: j */
    public abstract int mo11325j();

    /* JADX INFO: renamed from: k */
    public abstract long mo11326k();

    /* JADX INFO: renamed from: l */
    public abstract float mo11327l();

    /* JADX INFO: renamed from: m */
    public abstract int mo11328m();

    /* JADX INFO: renamed from: n */
    public abstract long mo11329n();

    /* JADX INFO: renamed from: o */
    public abstract int mo11330o();

    /* JADX INFO: renamed from: p */
    public abstract long mo11331p();

    /* JADX INFO: renamed from: q */
    public abstract int mo11332q();

    /* JADX INFO: renamed from: r */
    public abstract long mo11333r();

    /* JADX INFO: renamed from: s */
    public abstract String mo11334s();

    /* JADX INFO: renamed from: t */
    public abstract String mo11335t();

    /* JADX INFO: renamed from: u */
    public abstract int mo11336u();

    /* JADX INFO: renamed from: v */
    public abstract int mo11337v();

    /* JADX INFO: renamed from: w */
    public abstract long mo11338w();

    /* JADX INFO: renamed from: x */
    public abstract boolean mo11339x(int i);

    /* JADX INFO: renamed from: y */
    public void m12174y() throws i72 {
        boolean zMo11339x;
        do {
            int iMo11336u = mo11336u();
            if (iMo11336u == 0) {
                return;
            }
            int i = this.f33187a;
            int i2 = this.f33188b;
            if (i + i2 >= 100) {
                throw new i72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f33188b = i2 + 1;
            zMo11339x = mo11339x(iMo11336u);
            this.f33188b--;
        } while (zMo11339x);
    }

    /* JADX INFO: renamed from: z */
    public abstract qk6 mo4141z();
}

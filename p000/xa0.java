package p000;

import java.lang.invoke.VarHandle;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class xa0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34091a;

    /* JADX INFO: renamed from: b */
    public int f34092b;

    /* JADX INFO: renamed from: c */
    public int f34093c;

    /* JADX INFO: renamed from: d */
    public int f34094d;

    /* JADX INFO: renamed from: e */
    public Object f34095e;

    public /* synthetic */ xa0(byte b) {
        this.f34091a = b;
    }

    /* JADX INFO: renamed from: Y */
    public static void m12558Y(int i) throws h72 {
        if ((i & 3) != 0) {
            throw h72.m6267d();
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m12559Z(int i) throws i72 {
        if ((i & 3) != 0) {
            throw new i72("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: a0 */
    public static void m12560a0(int i) throws h72 {
        if ((i & 7) != 0) {
            throw h72.m6267d();
        }
    }

    /* JADX INFO: renamed from: b */
    public static xa0 m12561b(wa0 wa0Var) {
        xa0 xa0Var = (xa0) wa0Var.f33189c;
        if (xa0Var != null) {
            return xa0Var;
        }
        xa0 xa0Var2 = new xa0((byte) 1);
        xa0Var2.f34094d = 0;
        byte[] bArr = l62.f23817a;
        xa0Var2.f34095e = wa0Var;
        wa0Var.f33189c = xa0Var2;
        VarHandle.storeStoreFence();
        return xa0Var2;
    }

    /* JADX INFO: renamed from: b0 */
    public static void m12562b0(int i) throws i72 {
        if ((i & 7) != 0) {
            throw new i72("Failed to parse the message.");
        }
    }

    /* JADX INFO: renamed from: v0 */
    public static final void m12563v0(int i) throws ss5 {
        if ((i & 3) == 0) {
            return;
        }
        qm5.m9916g("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: w0 */
    public static final void m12564w0(int i) throws ss5 {
        if ((i & 7) == 0) {
            return;
        }
        qm5.m9916g("Failed to parse the message.");
    }

    /* JADX INFO: renamed from: z0 */
    public static xa0 m12565z0(wa0 wa0Var) {
        xa0 xa0Var = (xa0) wa0Var.f33189c;
        if (xa0Var != null) {
            return xa0Var;
        }
        xa0 xa0Var2 = new xa0((byte) 5);
        xa0Var2.f34094d = 0;
        byte[] bArr = kr5.f23354a;
        xa0Var2.f34095e = wa0Var;
        wa0Var.f33189c = xa0Var2;
        VarHandle.storeStoreFence();
        return xa0Var2;
    }

    /* JADX INFO: renamed from: A */
    public void m12566A(j62 j62Var) throws i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 2) {
            int iMo11337v = wa0Var.mo11337v();
            m12559Z(iMo11337v);
            int iMo11311b = wa0Var.mo11311b() + iMo11337v;
            do {
                j62Var.add(Float.valueOf(wa0Var.mo11327l()));
            } while (wa0Var.mo11311b() < iMo11311b);
            return;
        }
        if (i != 5) {
            throw i72.m6684b();
        }
        do {
            j62Var.add(Float.valueOf(wa0Var.mo11327l()));
            if (wa0Var.mo11313c()) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == this.f34092b);
        this.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: A0 */
    public void m12567A0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Boolean.valueOf(wa0Var.mo4115D()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Boolean.valueOf(wa0Var.mo4115D()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: B */
    public void m12568B(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f52;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Integer.valueOf(ta0Var.m11004j()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Integer.valueOf(ta0Var.m11004j()));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        f52 f52Var = (f52) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f52Var.m5560b(ta0Var.m11004j());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            f52Var.m5560b(ta0Var.m11004j());
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: B0 */
    public void m12569B0(gr5 gr5Var) throws ms5 {
        int iMo4126Q;
        if ((this.f34092b & 7) != 2) {
            qm5.m9910a();
            return;
        }
        do {
            gr5Var.add(m12639y0());
            wa0 wa0Var = (wa0) this.f34095e;
            if (wa0Var.mo4114C()) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == this.f34092b);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: C */
    public void m12570C(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Integer.valueOf(wa0Var.mo11328m()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Integer.valueOf(wa0Var.mo11328m()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: C0 */
    public void m12571C0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 1) {
            do {
                gr5Var.add(Double.valueOf(wa0Var.mo4117H()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4127R = wa0Var.mo4127R();
        m12564w0(iMo4127R);
        int iMo4119J = wa0Var.mo4119J() + iMo4127R;
        do {
            gr5Var.add(Double.valueOf(wa0Var.mo4117H()));
        } while (wa0Var.mo4119J() < iMo4119J);
    }

    /* JADX INFO: renamed from: D */
    public void m12572D(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof ao2;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Long.valueOf(ta0Var.m11005k()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Long.valueOf(ta0Var.m11005k()));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        ao2 ao2Var = (ao2) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ao2Var.m3098b(ta0Var.m11005k());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            ao2Var.m3098b(ta0Var.m11005k());
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: D0 */
    public void m12573D0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Integer.valueOf(wa0Var.mo4121L()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Integer.valueOf(wa0Var.mo4121L()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: E */
    public void m12574E(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Long.valueOf(wa0Var.mo11329n()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Long.valueOf(wa0Var.mo11329n()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: E0 */
    public void m12575E0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 2) {
            int iMo4127R = wa0Var.mo4127R();
            m12563v0(iMo4127R);
            int iMo4119J = wa0Var.mo4119J() + iMo4127R;
            do {
                gr5Var.add(Integer.valueOf(wa0Var.mo4122M()));
            } while (wa0Var.mo4119J() < iMo4119J);
            return;
        }
        if (i != 5) {
            qm5.m9910a();
            return;
        }
        do {
            gr5Var.add(Integer.valueOf(wa0Var.mo4122M()));
            if (wa0Var.mo4114C()) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == this.f34092b);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: F */
    public void m12576F(i62 i62Var) throws h72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f52;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iM11004j = ta0Var.m11004j();
                m12558Y(iM11004j);
                int iM10998c = ta0Var.m10998c() + iM11004j;
                do {
                    i62Var.add(Integer.valueOf(ta0Var.m11002h()));
                } while (ta0Var.m10998c() < iM10998c);
                return;
            }
            if (i2 != 5) {
                throw h72.m6265b();
            }
            do {
                i62Var.add(Integer.valueOf(ta0Var.m11002h()));
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m = ta0Var.m11007m();
                }
            } while (iM11007m == this.f34092b);
            this.f34094d = iM11007m;
            return;
        }
        f52 f52Var = (f52) i62Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int iM11004j2 = ta0Var.m11004j();
            m12558Y(iM11004j2);
            int iM10998c2 = ta0Var.m10998c() + iM11004j2;
            do {
                f52Var.m5560b(ta0Var.m11002h());
            } while (ta0Var.m10998c() < iM10998c2);
            return;
        }
        if (i3 != 5) {
            throw h72.m6265b();
        }
        do {
            f52Var.m5560b(ta0Var.m11002h());
            if (ta0Var.m10999d()) {
                return;
            } else {
                iM11007m2 = ta0Var.m11007m();
            }
        } while (iM11007m2 == this.f34092b);
        this.f34094d = iM11007m2;
    }

    /* JADX INFO: renamed from: G */
    public void m12577G(j62 j62Var) throws i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 2) {
            int iMo11337v = wa0Var.mo11337v();
            m12559Z(iMo11337v);
            int iMo11311b = wa0Var.mo11311b() + iMo11337v;
            do {
                j62Var.add(Integer.valueOf(wa0Var.mo11330o()));
            } while (wa0Var.mo11311b() < iMo11311b);
            return;
        }
        if (i != 5) {
            throw i72.m6684b();
        }
        do {
            j62Var.add(Integer.valueOf(wa0Var.mo11330o()));
            if (wa0Var.mo11313c()) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == this.f34092b);
        this.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: H */
    public void m12578H(i62 i62Var) throws h72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof ao2;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    i62Var.add(Long.valueOf(ta0Var.m11003i()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM11004j = ta0Var.m11004j();
            m12560a0(iM11004j);
            int iM10998c = ta0Var.m10998c() + iM11004j;
            do {
                i62Var.add(Long.valueOf(ta0Var.m11003i()));
            } while (ta0Var.m10998c() < iM10998c);
            return;
        }
        ao2 ao2Var = (ao2) i62Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ao2Var.m3098b(ta0Var.m11003i());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM11004j2 = ta0Var.m11004j();
        m12560a0(iM11004j2);
        int iM10998c2 = ta0Var.m10998c() + iM11004j2;
        do {
            ao2Var.m3098b(ta0Var.m11003i());
        } while (ta0Var.m10998c() < iM10998c2);
    }

    /* JADX INFO: renamed from: I */
    public void m12579I(j62 j62Var) throws i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 1) {
            do {
                j62Var.add(Long.valueOf(wa0Var.mo11331p()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11337v = wa0Var.mo11337v();
        m12562b0(iMo11337v);
        int iMo11311b = wa0Var.mo11311b() + iMo11337v;
        do {
            j62Var.add(Long.valueOf(wa0Var.mo11331p()));
        } while (wa0Var.mo11311b() < iMo11311b);
    }

    /* JADX INFO: renamed from: J */
    public void m12580J(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f52;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Integer.valueOf(ta0.m10995a(ta0Var.m11004j())));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Integer.valueOf(ta0.m10995a(ta0Var.m11004j())));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        f52 f52Var = (f52) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f52Var.m5560b(ta0.m10995a(ta0Var.m11004j()));
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            f52Var.m5560b(ta0.m10995a(ta0Var.m11004j()));
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: K */
    public void m12581K(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Integer.valueOf(wa0Var.mo11332q()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Integer.valueOf(wa0Var.mo11332q()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: L */
    public void m12582L(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof ao2;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Long.valueOf(ta0.m10996b(ta0Var.m11005k())));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Long.valueOf(ta0.m10996b(ta0Var.m11005k())));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        ao2 ao2Var = (ao2) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ao2Var.m3098b(ta0.m10996b(ta0Var.m11005k()));
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            ao2Var.m3098b(ta0.m10996b(ta0Var.m11005k()));
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: M */
    public void m12583M(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Long.valueOf(wa0Var.mo11333r()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Long.valueOf(wa0Var.mo11333r()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: N */
    public String m12584N() throws h72 {
        m12593W(2);
        ta0 ta0Var = (ta0) this.f34095e;
        int iM11004j = ta0Var.m11004j();
        if (iM11004j > 0) {
            int i = ta0Var.f31021d;
            int i2 = ta0Var.f31023f;
            if (iM11004j <= i - i2) {
                String str = new String(ta0Var.f31020c, i2, iM11004j, k62.f22939a);
                ta0Var.f31023f += iM11004j;
                return str;
            }
        }
        if (iM11004j == 0) {
            return "";
        }
        if (iM11004j < 0) {
            throw h72.m6266c();
        }
        throw h72.m6268e();
    }

    /* JADX INFO: renamed from: O */
    public void m12585O(i62 i62Var, boolean z) throws f72 {
        int iM11007m;
        ta0 ta0Var = (ta0) this.f34095e;
        if ((this.f34092b & 7) != 2) {
            throw h72.m6265b();
        }
        do {
            i62Var.add(z ? m12587Q() : m12584N());
            if (ta0Var.m10999d()) {
                return;
            } else {
                iM11007m = ta0Var.m11007m();
            }
        } while (iM11007m == this.f34092b);
        this.f34094d = iM11007m;
    }

    /* JADX INFO: renamed from: P */
    public void m12586P(j62 j62Var, boolean z) throws g72 {
        String strMo11334s;
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        if ((this.f34092b & 7) != 2) {
            throw i72.m6684b();
        }
        do {
            if (z) {
                m12593W(2);
                strMo11334s = wa0Var.mo11335t();
            } else {
                m12593W(2);
                strMo11334s = wa0Var.mo11334s();
            }
            j62Var.add(strMo11334s);
            if (wa0Var.mo11313c()) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == this.f34092b);
        this.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: Q */
    public String m12587Q() throws h72 {
        m12593W(2);
        ta0 ta0Var = (ta0) this.f34095e;
        int iM11004j = ta0Var.m11004j();
        if (iM11004j > 0) {
            int i = ta0Var.f31021d;
            int i2 = ta0Var.f31023f;
            if (iM11004j <= i - i2) {
                String strMo10473r = vv4.f32889a.mo10473r(ta0Var.f31020c, i2, iM11004j);
                ta0Var.f31023f += iM11004j;
                return strMo10473r;
            }
        }
        if (iM11004j == 0) {
            return "";
        }
        if (iM11004j <= 0) {
            throw h72.m6266c();
        }
        throw h72.m6268e();
    }

    /* JADX INFO: renamed from: R */
    public void m12588R(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f52;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Integer.valueOf(ta0Var.m11004j()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Integer.valueOf(ta0Var.m11004j()));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        f52 f52Var = (f52) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f52Var.m5560b(ta0Var.m11004j());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            f52Var.m5560b(ta0Var.m11004j());
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: S */
    public void m12589S(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Integer.valueOf(wa0Var.mo11337v()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Integer.valueOf(wa0Var.mo11337v()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: T */
    public void m12590T(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof ao2;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Long.valueOf(ta0Var.m11005k()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Long.valueOf(ta0Var.m11005k()));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        ao2 ao2Var = (ao2) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                ao2Var.m3098b(ta0Var.m11005k());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            ao2Var.m3098b(ta0Var.m11005k());
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: U */
    public void m12591U(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Long.valueOf(wa0Var.mo11338w()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Long.valueOf(wa0Var.mo11338w()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: V */
    public void m12592V(int i) throws h72, i72 {
        switch (this.f34091a) {
            case 0:
                if (((ta0) this.f34095e).m10998c() != i) {
                    throw h72.m6268e();
                }
                return;
            default:
                if (((wa0) this.f34095e).mo11311b() != i) {
                    throw i72.m6687e();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: W */
    public void m12593W(int i) {
        switch (this.f34091a) {
            case 0:
                if ((this.f34092b & 7) != i) {
                    throw h72.m6265b();
                }
                return;
            default:
                if ((this.f34092b & 7) != i) {
                    throw i72.m6684b();
                }
                return;
        }
    }

    /* JADX INFO: renamed from: X */
    public boolean m12594X() {
        int i;
        wa0 wa0Var = (wa0) this.f34095e;
        if (wa0Var.mo11313c() || (i = this.f34092b) == this.f34093c) {
            return false;
        }
        return wa0Var.mo11339x(i);
    }

    /* JADX INFO: renamed from: a */
    public k04 m12595a(int i) {
        return new k04(C0638f5.m5553x((jl4) this.f34095e, i), i, 1L);
    }

    /* JADX INFO: renamed from: c */
    public int m12596c() {
        return this.f34094d - this.f34093c;
    }

    /* JADX INFO: renamed from: c0 */
    public void m12597c0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 1) {
            do {
                gr5Var.add(Long.valueOf(wa0Var.mo4128S()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4127R = wa0Var.mo4127R();
        m12564w0(iMo4127R);
        int iMo4119J = wa0Var.mo4119J() + iMo4127R;
        do {
            gr5Var.add(Long.valueOf(wa0Var.mo4128S()));
        } while (wa0Var.mo4119J() < iMo4119J);
    }

    /* JADX INFO: renamed from: d */
    public int m12598d() {
        switch (this.f34091a) {
            case 0:
                int iM11007m = this.f34094d;
                if (iM11007m != 0) {
                    this.f34092b = iM11007m;
                    this.f34094d = 0;
                } else {
                    iM11007m = ((ta0) this.f34095e).m11007m();
                    this.f34092b = iM11007m;
                }
                if (iM11007m == 0 || iM11007m == this.f34093c) {
                    return Integer.MAX_VALUE;
                }
                return iM11007m >>> 3;
            default:
                int iMo11336u = this.f34094d;
                if (iMo11336u != 0) {
                    this.f34092b = iMo11336u;
                    this.f34094d = 0;
                } else {
                    iMo11336u = ((wa0) this.f34095e).mo11336u();
                    this.f34092b = iMo11336u;
                }
                if (iMo11336u == 0 || iMo11336u == this.f34093c) {
                    return Integer.MAX_VALUE;
                }
                return iMo11336u >>> 3;
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m12599d0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 2) {
            int iMo4127R = wa0Var.mo4127R();
            m12563v0(iMo4127R);
            int iMo4119J = wa0Var.mo4119J() + iMo4127R;
            do {
                gr5Var.add(Float.valueOf(wa0Var.mo4118I()));
            } while (wa0Var.mo4119J() < iMo4119J);
            return;
        }
        if (i != 5) {
            qm5.m9910a();
            return;
        }
        do {
            gr5Var.add(Float.valueOf(wa0Var.mo4118I()));
            if (wa0Var.mo4114C()) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == this.f34092b);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: e */
    public int m12600e(int i) {
        return ((x53) this.f34095e).f34017h[this.f34093c + i];
    }

    /* JADX INFO: renamed from: e0 */
    public void m12601e0(gr5 gr5Var, zv5 zv5Var, no5 no5Var) throws ss5 {
        int iMo4126Q;
        int i = this.f34092b;
        if ((i & 7) != 3) {
            qm5.m9910a();
            return;
        }
        do {
            ur1 ur1VarMo9297h = zv5Var.mo9297h();
            m12627r0(ur1VarMo9297h, zv5Var, no5Var);
            zv5Var.mo9290a(ur1VarMo9297h);
            gr5Var.add(ur1VarMo9297h);
            wa0 wa0Var = (wa0) this.f34095e;
            if (wa0Var.mo4114C() || this.f34094d != 0) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == i);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: f */
    public Object m12602f(int i) {
        return ((x53) this.f34095e).f34019j[this.f34094d + i];
    }

    /* JADX INFO: renamed from: f0 */
    public void m12603f0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Integer.valueOf(wa0Var.mo4123N()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Integer.valueOf(wa0Var.mo4123N()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: g */
    public void m12604g(Object obj, fw3 fw3Var, qc1 qc1Var) {
        int i = this.f34093c;
        this.f34093c = ((this.f34092b >>> 3) << 3) | 4;
        try {
            fw3Var.mo5834g(obj, this, qc1Var);
            if (this.f34092b != this.f34093c) {
                throw h72.m6267d();
            }
            this.f34093c = i;
        } catch (Throwable th) {
            this.f34093c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: g0 */
    public void m12605g0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Long.valueOf(wa0Var.mo4129T()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Long.valueOf(wa0Var.mo4129T()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: h */
    public void m12606h(Object obj, gw3 gw3Var, rc1 rc1Var) throws i72 {
        wa0 wa0Var = (wa0) this.f34095e;
        int i = wa0Var.f33187a;
        int i2 = wa0Var.f33188b;
        if (i + i2 >= 100) {
            throw new i72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int i3 = this.f34093c;
        this.f34093c = ((this.f34092b >>> 3) << 3) | 4;
        wa0Var.f33188b = i2 + 1;
        try {
            gw3Var.mo6184f(obj, this, rc1Var);
            if (this.f34092b != this.f34093c) {
                throw new i72("Failed to parse the message.");
            }
            wa0Var.f33188b--;
            this.f34093c = i3;
        } catch (Throwable th) {
            wa0Var.f33188b--;
            this.f34093c = i3;
            throw th;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m12607h0(wt5 wt5Var, tt2 tt2Var, no5 no5Var) throws ms5 {
        int i;
        int i2;
        m12633u0(2);
        wa0 wa0Var = (wa0) this.f34095e;
        int iMo4120K = wa0Var.mo4120K(wa0Var.mo4127R());
        or6 or6Var = (or6) tt2Var.f31430d;
        Object objM12625q0 = "";
        Object objM12625q1 = or6Var;
        while (true) {
            try {
                int iM12637x0 = m12637x0();
                if (iM12637x0 == Integer.MAX_VALUE || wa0Var.mo4114C()) {
                    break;
                }
                boolean zMo4116E = false;
                if (iM12637x0 == 1) {
                    objM12625q0 = m12625q0((dz5) tt2Var.f31428b, null, null);
                } else if (iM12637x0 != 2) {
                    try {
                        if (!((wa0Var.mo4114C() || (i2 = this.f34092b) == this.f34093c) ? false : wa0Var.mo4116E(i2))) {
                            throw new ss5("Unable to parse map entry.");
                        }
                    } catch (ms5 e) {
                        if (!wa0Var.mo4114C() && (i = this.f34092b) != this.f34093c) {
                            zMo4116E = wa0Var.mo4116E(i);
                        }
                        if (!zMo4116E) {
                            throw new ss5("Unable to parse map entry.", e);
                        }
                    }
                } else {
                    objM12625q1 = m12625q0((dz5) tt2Var.f31429c, or6Var.getClass(), no5Var);
                }
            } catch (Throwable th) {
                wa0Var.mo4113B(iMo4120K);
                throw th;
            }
        }
        wt5Var.put(objM12625q0, objM12625q1);
        wa0Var.mo4113B(iMo4120K);
    }

    /* JADX INFO: renamed from: i */
    public void m12608i(Object obj, fw3 fw3Var, qc1 qc1Var) throws h72 {
        ta0 ta0Var = (ta0) this.f34095e;
        int iM11004j = ta0Var.m11004j();
        if (ta0Var.f31018a + 0 >= 100) {
            throw new h72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iM11000f = ta0Var.m11000f(iM11004j);
        ta0Var.f31018a++;
        fw3Var.mo5834g(obj, this, qc1Var);
        if (ta0Var.f31025h != 0) {
            throw new h72("Protocol message end-group tag did not match expected tag.");
        }
        ta0Var.f31018a--;
        ta0Var.f31026i = iM11000f;
        ta0Var.m11008n();
    }

    /* JADX INFO: renamed from: i0 */
    public void m12609i0(gr5 gr5Var, zv5 zv5Var, no5 no5Var) throws ss5 {
        int iMo4126Q;
        int i = this.f34092b;
        if ((i & 7) != 2) {
            qm5.m9910a();
            return;
        }
        do {
            ur1 ur1VarMo9297h = zv5Var.mo9297h();
            m12629s0(ur1VarMo9297h, zv5Var, no5Var);
            zv5Var.mo9290a(ur1VarMo9297h);
            gr5Var.add(ur1VarMo9297h);
            wa0 wa0Var = (wa0) this.f34095e;
            if (wa0Var.mo4114C() || this.f34094d != 0) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == i);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: j */
    public void m12610j(Object obj, gw3 gw3Var, rc1 rc1Var) throws i72 {
        wa0 wa0Var = (wa0) this.f34095e;
        int iMo11337v = wa0Var.mo11337v();
        if (wa0Var.f33187a + wa0Var.f33188b >= 100) {
            throw new i72("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iMo11317e = wa0Var.mo11317e(iMo11337v);
        wa0Var.f33187a++;
        gw3Var.mo6184f(obj, this, rc1Var);
        wa0Var.mo11309a(0);
        wa0Var.f33187a--;
        wa0Var.mo11315d(iMo11317e);
    }

    /* JADX INFO: renamed from: j0 */
    public void m12611j0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 2) {
            int iMo4127R = wa0Var.mo4127R();
            m12563v0(iMo4127R);
            int iMo4119J = wa0Var.mo4119J() + iMo4127R;
            do {
                gr5Var.add(Integer.valueOf(wa0Var.mo4124O()));
            } while (wa0Var.mo4119J() < iMo4119J);
            return;
        }
        if (i != 5) {
            qm5.m9910a();
            return;
        }
        do {
            gr5Var.add(Integer.valueOf(wa0Var.mo4124O()));
            if (wa0Var.mo4114C()) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == this.f34092b);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: k */
    public void m12612k(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof x00;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Boolean.valueOf(ta0Var.m11001g()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Boolean.valueOf(ta0Var.m11001g()));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        x00 x00Var = (x00) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                x00Var.m12448b(ta0Var.m11001g());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            x00Var.m12448b(ta0Var.m11001g());
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: k0 */
    public void m12613k0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 1) {
            do {
                gr5Var.add(Long.valueOf(wa0Var.mo4130U()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4127R = wa0Var.mo4127R();
        m12564w0(iMo4127R);
        int iMo4119J = wa0Var.mo4119J() + iMo4127R;
        do {
            gr5Var.add(Long.valueOf(wa0Var.mo4130U()));
        } while (wa0Var.mo4119J() < iMo4119J);
    }

    /* JADX INFO: renamed from: l */
    public void m12614l(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Boolean.valueOf(wa0Var.mo11319f()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Boolean.valueOf(wa0Var.mo11319f()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: l0 */
    public void m12615l0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Integer.valueOf(wa0Var.mo4125P()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Integer.valueOf(wa0Var.mo4125P()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: m */
    public n50 m12616m() {
        m12593W(2);
        return ((wa0) this.f34095e).mo11321g();
    }

    /* JADX INFO: renamed from: m0 */
    public void m12617m0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Long.valueOf(wa0Var.mo4131V()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Long.valueOf(wa0Var.mo4131V()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0037 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:20:0x0045  */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX INFO: renamed from: n */
    public o50 m12618n() throws h72 {
        byte[] bArrCopyOfRange;
        m12593W(2);
        ta0 ta0Var = (ta0) this.f34095e;
        byte[] bArr = ta0Var.f31020c;
        int iM11004j = ta0Var.m11004j();
        if (iM11004j > 0) {
            int i = ta0Var.f31021d;
            int i2 = ta0Var.f31023f;
            if (iM11004j <= i - i2) {
                o50 o50VarM10980d = t50.m10980d(bArr, i2, iM11004j);
                ta0Var.f31023f += iM11004j;
                return o50VarM10980d;
            }
        }
        if (iM11004j == 0) {
            return t50.f30782b;
        }
        if (iM11004j > 0) {
            int i3 = ta0Var.f31021d;
            int i4 = ta0Var.f31023f;
            if (iM11004j <= i3 - i4) {
                int i5 = iM11004j + i4;
                ta0Var.f31023f = i5;
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i4, i5);
            } else {
                if (iM11004j <= 0) {
                    throw h72.m6268e();
                }
                if (iM11004j == 0) {
                    throw h72.m6266c();
                }
                bArrCopyOfRange = k62.f22940b;
            }
        } else {
            if (iM11004j <= 0) {
                throw h72.m6268e();
            }
            if (iM11004j == 0) {
                throw h72.m6266c();
            }
            bArrCopyOfRange = k62.f22940b;
        }
        o50 o50Var = t50.f30782b;
        return new o50(bArrCopyOfRange);
    }

    /* JADX INFO: renamed from: n0 */
    public void m12619n0(gr5 gr5Var, boolean z) throws ms5 {
        String strMo4133X;
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        if ((this.f34092b & 7) != 2) {
            qm5.m9910a();
            return;
        }
        do {
            if (z) {
                m12633u0(2);
                strMo4133X = wa0Var.mo4134Y();
            } else {
                m12633u0(2);
                strMo4133X = wa0Var.mo4133X();
            }
            gr5Var.add(strMo4133X);
            if (wa0Var.mo4114C()) {
                return;
            } else {
                iMo4126Q = wa0Var.mo4126Q();
            }
        } while (iMo4126Q == this.f34092b);
        this.f34094d = iMo4126Q;
    }

    /* JADX INFO: renamed from: o */
    public void m12620o(i62 i62Var) throws f72 {
        int iM11007m;
        ta0 ta0Var = (ta0) this.f34095e;
        if ((this.f34092b & 7) != 2) {
            throw h72.m6265b();
        }
        do {
            i62Var.add(m12618n());
            if (ta0Var.m10999d()) {
                return;
            } else {
                iM11007m = ta0Var.m11007m();
            }
        } while (iM11007m == this.f34092b);
        this.f34094d = iM11007m;
    }

    /* JADX INFO: renamed from: o0 */
    public void m12621o0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Integer.valueOf(wa0Var.mo4127R()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Integer.valueOf(wa0Var.mo4127R()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: p */
    public void m12622p(j62 j62Var) throws g72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        if ((this.f34092b & 7) != 2) {
            throw i72.m6684b();
        }
        do {
            j62Var.add(m12616m());
            if (wa0Var.mo11313c()) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == this.f34092b);
        this.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: p0 */
    public void m12623p0(gr5 gr5Var) throws ss5 {
        int iMo4126Q;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                gr5Var.add(Long.valueOf(wa0Var.mo4132W()));
                if (wa0Var.mo4114C()) {
                    return;
                } else {
                    iMo4126Q = wa0Var.mo4126Q();
                }
            } while (iMo4126Q == this.f34092b);
            this.f34094d = iMo4126Q;
            return;
        }
        if (i != 2) {
            qm5.m9910a();
            return;
        }
        int iMo4119J = wa0Var.mo4119J() + wa0Var.mo4127R();
        do {
            gr5Var.add(Long.valueOf(wa0Var.mo4132W()));
        } while (wa0Var.mo4119J() < iMo4119J);
        m12631t0(iMo4119J);
    }

    /* JADX INFO: renamed from: q */
    public void m12624q(i62 i62Var) throws h72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f11;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    i62Var.add(Double.valueOf(Double.longBitsToDouble(ta0Var.m11003i())));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM11004j = ta0Var.m11004j();
            m12560a0(iM11004j);
            int iM10998c = ta0Var.m10998c() + iM11004j;
            do {
                i62Var.add(Double.valueOf(Double.longBitsToDouble(ta0Var.m11003i())));
            } while (ta0Var.m10998c() < iM10998c);
            return;
        }
        f11 f11Var = (f11) i62Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                f11Var.m5443b(Double.longBitsToDouble(ta0Var.m11003i()));
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM11004j2 = ta0Var.m11004j();
        m12560a0(iM11004j2);
        int iM10998c2 = ta0Var.m10998c() + iM11004j2;
        do {
            f11Var.m5443b(Double.longBitsToDouble(ta0Var.m11003i()));
        } while (ta0Var.m10998c() < iM10998c2);
    }

    /* JADX INFO: renamed from: q0 */
    public Object m12625q0(dz5 dz5Var, Class cls, no5 no5Var) throws ss5 {
        wa0 wa0Var = (wa0) this.f34095e;
        dz5 dz5Var2 = dz5.f17537c;
        switch (dz5Var.ordinal()) {
            case 0:
                m12633u0(1);
                return Double.valueOf(wa0Var.mo4117H());
            case 1:
                m12633u0(5);
                return Float.valueOf(wa0Var.mo4118I());
            case 2:
                m12633u0(0);
                return Long.valueOf(wa0Var.mo4129T());
            case 3:
                m12633u0(0);
                return Long.valueOf(wa0Var.mo4132W());
            case 4:
                m12633u0(0);
                return Integer.valueOf(wa0Var.mo4123N());
            case 5:
                m12633u0(1);
                return Long.valueOf(wa0Var.mo4128S());
            case 6:
                m12633u0(5);
                return Integer.valueOf(wa0Var.mo4122M());
            case 7:
                m12633u0(0);
                return Boolean.valueOf(wa0Var.mo4115D());
            case 8:
                m12633u0(2);
                return wa0Var.mo4134Y();
            case 9:
            default:
                C1077qn.m9987m("unsupported field type.");
                return null;
            case 10:
                m12633u0(2);
                zv5 zv5VarM11661a = uv5.f32208b.m11661a(cls);
                ur1 ur1VarMo9297h = zv5VarM11661a.mo9297h();
                m12629s0(ur1VarMo9297h, zv5VarM11661a, no5Var);
                zv5VarM11661a.mo9290a(ur1VarMo9297h);
                return ur1VarMo9297h;
            case 11:
                return m12639y0();
            case 12:
                m12633u0(0);
                return Integer.valueOf(wa0Var.mo4127R());
            case 13:
                m12633u0(0);
                return Integer.valueOf(wa0Var.mo4121L());
            case 14:
                m12633u0(5);
                return Integer.valueOf(wa0Var.mo4124O());
            case 15:
                m12633u0(1);
                return Long.valueOf(wa0Var.mo4130U());
            case 16:
                m12633u0(0);
                return Integer.valueOf(wa0Var.mo4125P());
            case 17:
                m12633u0(0);
                return Long.valueOf(wa0Var.mo4131V());
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12626r(j62 j62Var) throws i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 1) {
            do {
                j62Var.add(Double.valueOf(wa0Var.mo11323h()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11337v = wa0Var.mo11337v();
        m12562b0(iMo11337v);
        int iMo11311b = wa0Var.mo11311b() + iMo11337v;
        do {
            j62Var.add(Double.valueOf(wa0Var.mo11323h()));
        } while (wa0Var.mo11311b() < iMo11311b);
    }

    /* JADX INFO: renamed from: r0 */
    public void m12627r0(Object obj, zv5 zv5Var, no5 no5Var) throws ss5 {
        wa0 wa0Var = (wa0) this.f34095e;
        wa0Var.m12172F();
        int i = this.f34093c;
        this.f34093c = ((this.f34092b >>> 3) << 3) | 4;
        wa0Var.f33188b++;
        try {
            zv5Var.mo9292c(obj, this, no5Var);
            if (this.f34092b != this.f34093c) {
                throw new ss5("Failed to parse the message.");
            }
            wa0Var.f33188b--;
            this.f34093c = i;
        } catch (Throwable th) {
            wa0Var.f33188b--;
            this.f34093c = i;
            throw th;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m12628s(i62 i62Var) throws h72, i72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f52;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 0) {
                do {
                    i62Var.add(Integer.valueOf(ta0Var.m11004j()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM10998c = ta0Var.m10998c() + ta0Var.m11004j();
            do {
                i62Var.add(Integer.valueOf(ta0Var.m11004j()));
            } while (ta0Var.m10998c() < iM10998c);
            m12592V(iM10998c);
            return;
        }
        f52 f52Var = (f52) i62Var;
        int i3 = i & 7;
        if (i3 == 0) {
            do {
                f52Var.m5560b(ta0Var.m11004j());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM10998c2 = ta0Var.m10998c() + ta0Var.m11004j();
        do {
            f52Var.m5560b(ta0Var.m11004j());
        } while (ta0Var.m10998c() < iM10998c2);
        m12592V(iM10998c2);
    }

    /* JADX INFO: renamed from: s0 */
    public void m12629s0(Object obj, zv5 zv5Var, no5 no5Var) throws ss5 {
        wa0 wa0Var = (wa0) this.f34095e;
        int iMo4127R = wa0Var.mo4127R();
        wa0Var.m12172F();
        int iMo4120K = wa0Var.mo4120K(iMo4127R);
        wa0Var.f33187a++;
        zv5Var.mo9292c(obj, this, no5Var);
        wa0Var.mo4112A(0);
        wa0Var.f33187a--;
        wa0Var.mo4113B(iMo4120K);
    }

    /* JADX INFO: renamed from: t */
    public void m12630t(j62 j62Var) throws h72, i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 0) {
            do {
                j62Var.add(Integer.valueOf(wa0Var.mo11324i()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11311b = wa0Var.mo11311b() + wa0Var.mo11337v();
        do {
            j62Var.add(Integer.valueOf(wa0Var.mo11324i()));
        } while (wa0Var.mo11311b() < iMo11311b);
        m12592V(iMo11311b);
    }

    /* JADX INFO: renamed from: t0 */
    public void m12631t0(int i) throws ss5 {
        if (((wa0) this.f34095e).mo4119J() == i) {
            return;
        }
        qm5.m9916g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public String toString() {
        switch (this.f34091a) {
            case 2:
                return "";
            case 3:
            default:
                return super.toString();
            case 4:
                int i = this.f34092b;
                jl4 jl4Var = (jl4) this.f34095e;
                oo3 oo3VarM5553x = C0638f5.m5553x(jl4Var, i);
                int i2 = this.f34093c;
                oo3 oo3VarM5553x2 = C0638f5.m5553x(jl4Var, i2);
                int i3 = this.f34094d;
                StringBuilder sb = new StringBuilder("SelectionInfo(id=1, range=(");
                sb.append(i);
                sb.append("-");
                sb.append(oo3VarM5553x);
                sb.append(",");
                sb.append(i2);
                sb.append("-");
                sb.append(oo3VarM5553x2);
                sb.append("), prevOffset=");
                return c75.m3880l(sb, i3, ")");
        }
    }

    /* JADX INFO: renamed from: u */
    public Object m12632u(u15 u15Var, Class cls, rc1 rc1Var) throws i72 {
        wa0 wa0Var = (wa0) this.f34095e;
        switch (u15Var.ordinal()) {
            case 0:
                m12593W(1);
                return Double.valueOf(wa0Var.mo11323h());
            case 1:
                m12593W(5);
                return Float.valueOf(wa0Var.mo11327l());
            case 2:
                m12593W(0);
                return Long.valueOf(wa0Var.mo11329n());
            case 3:
                m12593W(0);
                return Long.valueOf(wa0Var.mo11338w());
            case 4:
                m12593W(0);
                return Integer.valueOf(wa0Var.mo11328m());
            case 5:
                m12593W(1);
                return Long.valueOf(wa0Var.mo11326k());
            case 6:
                m12593W(5);
                return Integer.valueOf(wa0Var.mo11325j());
            case 7:
                m12593W(0);
                return Boolean.valueOf(wa0Var.mo11319f());
            case 8:
                m12593W(2);
                return wa0Var.mo11335t();
            case 9:
            default:
                C1077qn.m9987m("unsupported field type.");
                return null;
            case 10:
                m12593W(2);
                gw3 gw3VarM10338a = rh3.f29290c.m10338a(cls);
                vr1 vr1VarMo6182d = gw3VarM10338a.mo6182d();
                m12610j(vr1VarMo6182d, gw3VarM10338a, rc1Var);
                gw3VarM10338a.mo6180b(vr1VarMo6182d);
                return vr1VarMo6182d;
            case 11:
                return m12616m();
            case 12:
                m12593W(0);
                return Integer.valueOf(wa0Var.mo11337v());
            case 13:
                m12593W(0);
                return Integer.valueOf(wa0Var.mo11324i());
            case 14:
                m12593W(5);
                return Integer.valueOf(wa0Var.mo11330o());
            case 15:
                m12593W(1);
                return Long.valueOf(wa0Var.mo11331p());
            case 16:
                m12593W(0);
                return Integer.valueOf(wa0Var.mo11332q());
            case 17:
                m12593W(0);
                return Long.valueOf(wa0Var.mo11333r());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m12633u0(int i) throws ms5 {
        if ((this.f34092b & 7) == i) {
            return;
        }
        qm5.m9910a();
    }

    /* JADX INFO: renamed from: v */
    public void m12634v(i62 i62Var) throws h72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof f52;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iM11004j = ta0Var.m11004j();
                m12558Y(iM11004j);
                int iM10998c = ta0Var.m10998c() + iM11004j;
                do {
                    i62Var.add(Integer.valueOf(ta0Var.m11002h()));
                } while (ta0Var.m10998c() < iM10998c);
                return;
            }
            if (i2 != 5) {
                throw h72.m6265b();
            }
            do {
                i62Var.add(Integer.valueOf(ta0Var.m11002h()));
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m = ta0Var.m11007m();
                }
            } while (iM11007m == this.f34092b);
            this.f34094d = iM11007m;
            return;
        }
        f52 f52Var = (f52) i62Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int iM11004j2 = ta0Var.m11004j();
            m12558Y(iM11004j2);
            int iM10998c2 = ta0Var.m10998c() + iM11004j2;
            do {
                f52Var.m5560b(ta0Var.m11002h());
            } while (ta0Var.m10998c() < iM10998c2);
            return;
        }
        if (i3 != 5) {
            throw h72.m6265b();
        }
        do {
            f52Var.m5560b(ta0Var.m11002h());
            if (ta0Var.m10999d()) {
                return;
            } else {
                iM11007m2 = ta0Var.m11007m();
            }
        } while (iM11007m2 == this.f34092b);
        this.f34094d = iM11007m2;
    }

    /* JADX INFO: renamed from: w */
    public void m12635w(j62 j62Var) throws i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 2) {
            int iMo11337v = wa0Var.mo11337v();
            m12559Z(iMo11337v);
            int iMo11311b = wa0Var.mo11311b() + iMo11337v;
            do {
                j62Var.add(Integer.valueOf(wa0Var.mo11325j()));
            } while (wa0Var.mo11311b() < iMo11311b);
            return;
        }
        if (i != 5) {
            throw i72.m6684b();
        }
        do {
            j62Var.add(Integer.valueOf(wa0Var.mo11325j()));
            if (wa0Var.mo11313c()) {
                return;
            } else {
                iMo11336u = wa0Var.mo11336u();
            }
        } while (iMo11336u == this.f34092b);
        this.f34094d = iMo11336u;
    }

    /* JADX INFO: renamed from: x */
    public void m12636x(i62 i62Var) throws h72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof ao2;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 1) {
                do {
                    i62Var.add(Long.valueOf(ta0Var.m11003i()));
                    if (ta0Var.m10999d()) {
                        return;
                    } else {
                        iM11007m = ta0Var.m11007m();
                    }
                } while (iM11007m == this.f34092b);
                this.f34094d = iM11007m;
                return;
            }
            if (i2 != 2) {
                throw h72.m6265b();
            }
            int iM11004j = ta0Var.m11004j();
            m12560a0(iM11004j);
            int iM10998c = ta0Var.m10998c() + iM11004j;
            do {
                i62Var.add(Long.valueOf(ta0Var.m11003i()));
            } while (ta0Var.m10998c() < iM10998c);
            return;
        }
        ao2 ao2Var = (ao2) i62Var;
        int i3 = i & 7;
        if (i3 == 1) {
            do {
                ao2Var.m3098b(ta0Var.m11003i());
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m2 = ta0Var.m11007m();
                }
            } while (iM11007m2 == this.f34092b);
            this.f34094d = iM11007m2;
            return;
        }
        if (i3 != 2) {
            throw h72.m6265b();
        }
        int iM11004j2 = ta0Var.m11004j();
        m12560a0(iM11004j2);
        int iM10998c2 = ta0Var.m10998c() + iM11004j2;
        do {
            ao2Var.m3098b(ta0Var.m11003i());
        } while (ta0Var.m10998c() < iM10998c2);
    }

    /* JADX INFO: renamed from: x0 */
    public int m12637x0() {
        int iMo4126Q = this.f34094d;
        if (iMo4126Q != 0) {
            this.f34092b = iMo4126Q;
            this.f34094d = 0;
        } else {
            iMo4126Q = ((wa0) this.f34095e).mo4126Q();
            this.f34092b = iMo4126Q;
        }
        if (iMo4126Q == 0 || iMo4126Q == this.f34093c) {
            return Integer.MAX_VALUE;
        }
        return iMo4126Q >>> 3;
    }

    /* JADX INFO: renamed from: y */
    public void m12638y(j62 j62Var) throws i72 {
        int iMo11336u;
        wa0 wa0Var = (wa0) this.f34095e;
        int i = this.f34092b & 7;
        if (i == 1) {
            do {
                j62Var.add(Long.valueOf(wa0Var.mo11326k()));
                if (wa0Var.mo11313c()) {
                    return;
                } else {
                    iMo11336u = wa0Var.mo11336u();
                }
            } while (iMo11336u == this.f34092b);
            this.f34094d = iMo11336u;
            return;
        }
        if (i != 2) {
            throw i72.m6684b();
        }
        int iMo11337v = wa0Var.mo11337v();
        m12562b0(iMo11337v);
        int iMo11311b = wa0Var.mo11311b() + iMo11337v;
        do {
            j62Var.add(Long.valueOf(wa0Var.mo11326k()));
        } while (wa0Var.mo11311b() < iMo11311b);
    }

    /* JADX INFO: renamed from: y0 */
    public aj6 m12639y0() throws ms5 {
        m12633u0(2);
        return ((wa0) this.f34095e).mo4141z();
    }

    /* JADX INFO: renamed from: z */
    public void m12640z(i62 i62Var) throws h72 {
        int iM11007m;
        int iM11007m2;
        ta0 ta0Var = (ta0) this.f34095e;
        boolean z = i62Var instanceof fi1;
        int i = this.f34092b;
        if (!z) {
            int i2 = i & 7;
            if (i2 == 2) {
                int iM11004j = ta0Var.m11004j();
                m12558Y(iM11004j);
                int iM10998c = ta0Var.m10998c() + iM11004j;
                do {
                    i62Var.add(Float.valueOf(Float.intBitsToFloat(ta0Var.m11002h())));
                } while (ta0Var.m10998c() < iM10998c);
                return;
            }
            if (i2 != 5) {
                throw h72.m6265b();
            }
            do {
                i62Var.add(Float.valueOf(Float.intBitsToFloat(ta0Var.m11002h())));
                if (ta0Var.m10999d()) {
                    return;
                } else {
                    iM11007m = ta0Var.m11007m();
                }
            } while (iM11007m == this.f34092b);
            this.f34094d = iM11007m;
            return;
        }
        fi1 fi1Var = (fi1) i62Var;
        int i3 = i & 7;
        if (i3 == 2) {
            int iM11004j2 = ta0Var.m11004j();
            m12558Y(iM11004j2);
            int iM10998c2 = ta0Var.m10998c() + iM11004j2;
            do {
                fi1Var.m5713b(Float.intBitsToFloat(ta0Var.m11002h()));
            } while (ta0Var.m10998c() < iM10998c2);
            return;
        }
        if (i3 != 5) {
            throw h72.m6265b();
        }
        do {
            fi1Var.m5713b(Float.intBitsToFloat(ta0Var.m11002h()));
            if (ta0Var.m10999d()) {
                return;
            } else {
                iM11007m2 = ta0Var.m11007m();
            }
        } while (iM11007m2 == this.f34092b);
        this.f34094d = iM11007m2;
    }
}

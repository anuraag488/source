package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class z76 {

    /* JADX INFO: renamed from: A */
    public Long f35818A;

    /* JADX INFO: renamed from: B */
    public long f35819B;

    /* JADX INFO: renamed from: C */
    public String f35820C;

    /* JADX INFO: renamed from: D */
    public int f35821D;

    /* JADX INFO: renamed from: E */
    public int f35822E;

    /* JADX INFO: renamed from: F */
    public long f35823F;

    /* JADX INFO: renamed from: G */
    public String f35824G;

    /* JADX INFO: renamed from: H */
    public byte[] f35825H;

    /* JADX INFO: renamed from: I */
    public int f35826I;

    /* JADX INFO: renamed from: J */
    public long f35827J;

    /* JADX INFO: renamed from: K */
    public long f35828K;

    /* JADX INFO: renamed from: L */
    public long f35829L;

    /* JADX INFO: renamed from: M */
    public long f35830M;

    /* JADX INFO: renamed from: N */
    public long f35831N;

    /* JADX INFO: renamed from: O */
    public long f35832O;

    /* JADX INFO: renamed from: P */
    public String f35833P;

    /* JADX INFO: renamed from: Q */
    public boolean f35834Q;

    /* JADX INFO: renamed from: R */
    public long f35835R;

    /* JADX INFO: renamed from: S */
    public long f35836S;

    /* JADX INFO: renamed from: a */
    public final oa6 f35837a;

    /* JADX INFO: renamed from: b */
    public final String f35838b;

    /* JADX INFO: renamed from: c */
    public String f35839c;

    /* JADX INFO: renamed from: d */
    public String f35840d;

    /* JADX INFO: renamed from: e */
    public String f35841e;

    /* JADX INFO: renamed from: f */
    public String f35842f;

    /* JADX INFO: renamed from: g */
    public long f35843g;

    /* JADX INFO: renamed from: h */
    public long f35844h;

    /* JADX INFO: renamed from: i */
    public long f35845i;

    /* JADX INFO: renamed from: j */
    public String f35846j;

    /* JADX INFO: renamed from: k */
    public long f35847k;

    /* JADX INFO: renamed from: l */
    public String f35848l;

    /* JADX INFO: renamed from: m */
    public long f35849m;

    /* JADX INFO: renamed from: n */
    public long f35850n;

    /* JADX INFO: renamed from: o */
    public boolean f35851o;

    /* JADX INFO: renamed from: p */
    public boolean f35852p;

    /* JADX INFO: renamed from: q */
    public Boolean f35853q;

    /* JADX INFO: renamed from: r */
    public long f35854r;

    /* JADX INFO: renamed from: s */
    public ArrayList f35855s;

    /* JADX INFO: renamed from: t */
    public String f35856t;

    /* JADX INFO: renamed from: u */
    public boolean f35857u;

    /* JADX INFO: renamed from: v */
    public long f35858v;

    /* JADX INFO: renamed from: w */
    public long f35859w;

    /* JADX INFO: renamed from: x */
    public int f35860x;

    /* JADX INFO: renamed from: y */
    public boolean f35861y;

    /* JADX INFO: renamed from: z */
    public Long f35862z;

    public z76(oa6 oa6Var, String str) {
        y42.m12854a0(oa6Var);
        y42.m12851X(str);
        this.f35837a = oa6Var;
        this.f35838b = str;
        ea6 ea6Var = oa6Var.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
    }

    /* JADX INFO: renamed from: A */
    public final void m13401A(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35859w != j;
        this.f35859w = j;
    }

    /* JADX INFO: renamed from: B */
    public final void m13402B(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35819B != j;
        this.f35819B = j;
    }

    /* JADX INFO: renamed from: C */
    public final String m13403C() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35820C;
    }

    /* JADX INFO: renamed from: D */
    public final String m13404D() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35838b;
    }

    /* JADX INFO: renamed from: E */
    public final String m13405E() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35839c;
    }

    /* JADX INFO: renamed from: F */
    public final void m13406F(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= !Objects.equals(this.f35839c, str);
        this.f35839c = str;
    }

    /* JADX INFO: renamed from: G */
    public final String m13407G() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35840d;
    }

    /* JADX INFO: renamed from: H */
    public final void m13408H(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f35834Q |= true ^ Objects.equals(this.f35840d, str);
        this.f35840d = str;
    }

    /* JADX INFO: renamed from: I */
    public final void m13409I(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= !Objects.equals(this.f35841e, str);
        this.f35841e = str;
    }

    /* JADX INFO: renamed from: J */
    public final String m13410J() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35842f;
    }

    /* JADX INFO: renamed from: K */
    public final void m13411K(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= !Objects.equals(this.f35842f, str);
        this.f35842f = str;
    }

    /* JADX INFO: renamed from: L */
    public final void m13412L(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35844h != j;
        this.f35844h = j;
    }

    /* JADX INFO: renamed from: M */
    public final void m13413M(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35845i != j;
        this.f35845i = j;
    }

    /* JADX INFO: renamed from: N */
    public final String m13414N() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35846j;
    }

    /* JADX INFO: renamed from: O */
    public final void m13415O(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= !Objects.equals(this.f35846j, str);
        this.f35846j = str;
    }

    /* JADX INFO: renamed from: P */
    public final long m13416P() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35847k;
    }

    /* JADX INFO: renamed from: Q */
    public final void m13417Q(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35847k != j;
        this.f35847k = j;
    }

    /* JADX INFO: renamed from: R */
    public final void m13418R(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= !Objects.equals(this.f35848l, str);
        this.f35848l = str;
    }

    /* JADX INFO: renamed from: S */
    public final void m13419S(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35849m != j;
        this.f35849m = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m13420a(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35850n != j;
        this.f35850n = j;
    }

    /* JADX INFO: renamed from: b */
    public final long m13421b() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35854r;
    }

    /* JADX INFO: renamed from: c */
    public final void m13422c(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35854r != j;
        this.f35854r = j;
    }

    /* JADX INFO: renamed from: d */
    public final void m13423d(boolean z) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35851o != z;
        this.f35851o = z;
    }

    /* JADX INFO: renamed from: e */
    public final void m13424e(long j) {
        y42.m12849V(j >= 0);
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35843g != j;
        this.f35843g = j;
    }

    /* JADX INFO: renamed from: f */
    public final void m13425f(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35835R != j;
        this.f35835R = j;
    }

    /* JADX INFO: renamed from: g */
    public final void m13426g(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35836S != j;
        this.f35836S = j;
    }

    /* JADX INFO: renamed from: h */
    public final void m13427h(long j) {
        oa6 oa6Var = this.f35837a;
        ea6 ea6Var = oa6Var.f26515g;
        d76 d76Var = oa6Var.f26514f;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        long j2 = this.f35843g + j;
        String str = this.f35838b;
        if (j2 > 2147483647L) {
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(d76.m4401y(str), "Bundle index overflow. appId");
            j2 = (-1) + j;
        }
        long j3 = this.f35823F + 1;
        if (j3 > 2147483647L) {
            oa6.m9016l(d76Var);
            d76Var.f16838m.m12505b(d76.m4401y(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.f35834Q = true;
        this.f35843g = j2;
        this.f35823F = j3;
    }

    /* JADX INFO: renamed from: i */
    public final void m13428i(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35827J != j;
        this.f35827J = j;
    }

    /* JADX INFO: renamed from: j */
    public final void m13429j(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35828K != j;
        this.f35828K = j;
    }

    /* JADX INFO: renamed from: k */
    public final void m13430k(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35829L != j;
        this.f35829L = j;
    }

    /* JADX INFO: renamed from: l */
    public final void m13431l(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35830M != j;
        this.f35830M = j;
    }

    /* JADX INFO: renamed from: m */
    public final void m13432m(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35832O != j;
        this.f35832O = j;
    }

    /* JADX INFO: renamed from: n */
    public final void m13433n(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35831N != j;
        this.f35831N = j;
    }

    /* JADX INFO: renamed from: o */
    public final boolean m13434o() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35834Q;
    }

    /* JADX INFO: renamed from: p */
    public final void m13435p(int i) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35821D != i;
        this.f35821D = i;
    }

    /* JADX INFO: renamed from: q */
    public final void m13436q(int i) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35822E != i;
        this.f35822E = i;
    }

    /* JADX INFO: renamed from: r */
    public final void m13437r(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35823F != j;
        this.f35823F = j;
    }

    /* JADX INFO: renamed from: s */
    public final String m13438s() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35824G;
    }

    /* JADX INFO: renamed from: t */
    public final int m13439t() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35826I;
    }

    /* JADX INFO: renamed from: u */
    public final String m13440u() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        String str = this.f35833P;
        m13441v(null);
        return str;
    }

    /* JADX INFO: renamed from: v */
    public final void m13441v(String str) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= !Objects.equals(this.f35833P, str);
        this.f35833P = str;
    }

    /* JADX INFO: renamed from: w */
    public final Boolean m13442w() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35853q;
    }

    /* JADX INFO: renamed from: x */
    public final void m13443x(List list) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        if (Objects.equals(this.f35855s, list)) {
            return;
        }
        this.f35834Q = true;
        this.f35855s = list != null ? new ArrayList(list) : null;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m13444y() {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        return this.f35857u;
    }

    /* JADX INFO: renamed from: z */
    public final void m13445z(long j) {
        ea6 ea6Var = this.f35837a.f26515g;
        oa6.m9016l(ea6Var);
        ea6Var.mo5038t();
        this.f35834Q |= this.f35858v != j;
        this.f35858v = j;
    }
}

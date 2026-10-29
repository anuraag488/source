package p000;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class t05 {

    /* JADX INFO: renamed from: b */
    public static final w05 f30710b;

    /* JADX INFO: renamed from: a */
    public final w05 f30711a;

    static {
        k05 h05Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 36) {
            h05Var = new j05();
        } else if (i >= 35) {
            h05Var = new i05();
        } else {
            h05Var = i >= 34 ? new h05() : new g05();
        }
        f30710b = h05Var.mo4837b().f33012a.mo8474a().f33012a.mo8169b().f33012a.mo8170c();
    }

    public t05(w05 w05Var) {
        this.f30711a = w05Var;
    }

    /* JADX INFO: renamed from: a */
    public w05 mo8474a() {
        return this.f30711a;
    }

    /* JADX INFO: renamed from: b */
    public w05 mo8169b() {
        return this.f30711a;
    }

    /* JADX INFO: renamed from: c */
    public w05 mo8170c() {
        return this.f30711a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t05)) {
            return false;
        }
        t05 t05Var = (t05) obj;
        return mo7783t() == t05Var.mo7783t() && mo8172s() == t05Var.mo8172s() && Objects.equals(mo7779n(), t05Var.mo7779n()) && Objects.equals(mo8171l(), t05Var.mo8171l()) && Objects.equals(mo8475h(), t05Var.mo8475h());
    }

    /* JADX INFO: renamed from: f */
    public List<Rect> mo7775f(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: g */
    public List<Rect> mo7776g(int i) {
        return Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: h */
    public m01 mo8475h() {
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(mo7783t()), Boolean.valueOf(mo8172s()), mo7779n(), mo8171l(), mo8475h());
    }

    /* JADX INFO: renamed from: i */
    public g42 mo7777i(int i) {
        return g42.f19605e;
    }

    /* JADX INFO: renamed from: j */
    public g42 mo7778j(int i) {
        if ((i & 8) == 0) {
            return g42.f19605e;
        }
        C1077qn.m9987m("Unable to query the maximum insets for IME");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public g42 mo8914k() {
        return mo7779n();
    }

    /* JADX INFO: renamed from: l */
    public g42 mo8171l() {
        return g42.f19605e;
    }

    /* JADX INFO: renamed from: m */
    public g42 mo8915m() {
        return mo7779n();
    }

    /* JADX INFO: renamed from: n */
    public g42 mo7779n() {
        return g42.f19605e;
    }

    /* JADX INFO: renamed from: o */
    public g42 mo8916o() {
        return mo7779n();
    }

    /* JADX INFO: renamed from: r */
    public w05 mo7782r(int i, int i2, int i3, int i4) {
        return f30710b;
    }

    /* JADX INFO: renamed from: s */
    public boolean mo8172s() {
        return false;
    }

    /* JADX INFO: renamed from: t */
    public boolean mo7783t() {
        return false;
    }

    /* JADX INFO: renamed from: u */
    public boolean mo7784u(int i) {
        return true;
    }

    /* JADX INFO: renamed from: A */
    public void mo7769A(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: B */
    public void mo7770B(Rect[][] rectArr) {
    }

    /* JADX INFO: renamed from: d */
    public void mo7773d(View view) {
    }

    /* JADX INFO: renamed from: e */
    public void mo7774e(w05 w05Var) {
    }

    /* JADX INFO: renamed from: p */
    public void mo7780p(View view) {
    }

    /* JADX INFO: renamed from: v */
    public void mo7785v(o01 o01Var) {
    }

    /* JADX INFO: renamed from: w */
    public void mo7786w(g42[] g42VarArr) {
    }

    /* JADX INFO: renamed from: x */
    public void mo7787x(g42 g42Var) {
    }

    /* JADX INFO: renamed from: y */
    public void mo7788y(w05 w05Var) {
    }

    /* JADX INFO: renamed from: z */
    public void mo7789z(int i) {
    }

    /* JADX INFO: renamed from: q */
    public void mo7781q() {
    }
}

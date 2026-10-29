package p000;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class tn0 {

    /* JADX INFO: renamed from: j */
    public static final Pattern f31243j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: k */
    public static final Pattern f31244k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: l */
    public static final Pattern f31245l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: m */
    public static final Pattern f31246m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: a */
    public String f31247a;

    /* JADX INFO: renamed from: b */
    public String f31248b;

    /* JADX INFO: renamed from: c */
    public long f31249c;

    /* JADX INFO: renamed from: d */
    public String f31250d;

    /* JADX INFO: renamed from: e */
    public String f31251e;

    /* JADX INFO: renamed from: f */
    public boolean f31252f;

    /* JADX INFO: renamed from: g */
    public boolean f31253g;

    /* JADX INFO: renamed from: h */
    public boolean f31254h;

    /* JADX INFO: renamed from: i */
    public boolean f31255i;

    public final boolean equals(Object obj) {
        if (!(obj instanceof tn0)) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        return tn0Var.f31247a.equals(this.f31247a) && tn0Var.f31248b.equals(this.f31248b) && tn0Var.f31249c == this.f31249c && tn0Var.f31250d.equals(this.f31250d) && tn0Var.f31251e.equals(this.f31251e) && tn0Var.f31252f == this.f31252f && tn0Var.f31253g == this.f31253g && tn0Var.f31254h == this.f31254h && tn0Var.f31255i == this.f31255i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f31255i) + zi4.m13611k(zi4.m13611k(zi4.m13611k(zi4.m13613m(zi4.m13613m(zi4.m13612l(zi4.m13613m(zi4.m13613m(527, this.f31247a, 31), this.f31248b, 31), this.f31249c, 31), this.f31250d, 31), this.f31251e, 31), 31, this.f31252f), 31, this.f31253g), 31, this.f31254h);
    }

    public final String toString() {
        long j = this.f31249c;
        StringBuilder sb = new StringBuilder(this.f31247a);
        sb.append('=');
        sb.append(this.f31248b);
        if (this.f31254h) {
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                sb.append(((DateFormat) xu0.f34625a.get()).format(new Date(j)));
            }
        }
        if (!this.f31255i) {
            sb.append("; domain=");
            sb.append(this.f31250d);
        }
        sb.append("; path=");
        sb.append(this.f31251e);
        if (this.f31252f) {
            sb.append("; secure");
        }
        if (this.f31253g) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}

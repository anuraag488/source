package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class bo3 {

    /* JADX INFO: renamed from: a */
    public dz1 f15462a;

    /* JADX INFO: renamed from: b */
    public String f15463b;

    /* JADX INFO: renamed from: c */
    public uv1 f15464c;

    /* JADX INFO: renamed from: d */
    public zi3 f15465d;

    /* JADX INFO: renamed from: e */
    public Map f15466e;

    /* JADX INFO: renamed from: f */
    public x50 f15467f;

    /* JADX INFO: renamed from: a */
    public final x50 m3643a() {
        x50 x50Var = this.f15467f;
        if (x50Var != null) {
            return x50Var;
        }
        x50 x50VarM11826J = vd6.m11826J(this.f15464c);
        this.f15467f = x50VarM11826J;
        return x50VarM11826J;
    }

    /* JADX INFO: renamed from: b */
    public final C1122rv m3644b() {
        C1122rv c1122rv = new C1122rv(false);
        c1122rv.f29655f = new LinkedHashMap();
        c1122rv.f29651b = this.f15462a;
        c1122rv.f29652c = this.f15463b;
        c1122rv.f29654e = this.f15465d;
        Map map = this.f15466e;
        c1122rv.f29655f = map.isEmpty() ? new LinkedHashMap() : new LinkedHashMap(map);
        c1122rv.f29653d = this.f15464c.m11659c();
        return c1122rv;
    }

    public final String toString() {
        Map map = this.f15466e;
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f15463b);
        sb.append(", url=");
        sb.append(this.f15462a);
        uv1 uv1Var = this.f15464c;
        if (uv1Var.size() != 0) {
            sb.append(", headers=[");
            Iterator it = uv1Var.iterator();
            int i = 0;
            while (true) {
                C1018p1 c1018p1 = (C1018p1) it;
                if (!c1018p1.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = c1018p1.next();
                int i2 = i + 1;
                if (i < 0) {
                    kx5.m7735t0();
                    throw null;
                }
                l73 l73Var = (l73) next;
                String str = (String) l73Var.f23833a;
                String str2 = (String) l73Var.f23834b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i = i2;
            }
        }
        if (!map.isEmpty()) {
            sb.append(", tags=");
            sb.append(map);
        }
        sb.append('}');
        return sb.toString();
    }
}

package p000;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class fx0 {

    /* JADX INFO: renamed from: a */
    public String f19371a;

    /* JADX INFO: renamed from: b */
    public js1 f19372b;

    /* JADX INFO: renamed from: a */
    public static String m5841a(Set set) {
        StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C0811ju c0811ju = (C0811ju) it.next();
            sb.append(c0811ju.f22614a);
            sb.append('/');
            sb.append(c0811ju.f22615b);
            if (it.hasNext()) {
                sb.append(' ');
            }
        }
        return sb.toString();
    }
}

package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c24 extends d24 {
    /* JADX INFO: renamed from: O */
    public static String m3832O(a24 a24Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : a24Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            zc6.m13531p(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    /* JADX INFO: renamed from: P */
    public static List m3833P(a24 a24Var) {
        Iterator it = a24Var.iterator();
        if (!it.hasNext()) {
            return v71.f32439a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}

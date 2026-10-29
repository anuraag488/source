package p000;

import java.lang.invoke.VarHandle;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class zv1 {

    /* JADX INFO: renamed from: b */
    public static final xd3 f36407b = new xd3("fire-global");

    /* JADX INFO: renamed from: c */
    public static final xd3 f36408c = new xd3("fire-count");

    /* JADX INFO: renamed from: d */
    public static final xd3 f36409d = new xd3("last-used-date");

    /* JADX INFO: renamed from: a */
    public e82 f36410a;

    /* JADX INFO: renamed from: b */
    public static String m13802b(long j) {
        return new Date(j).toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ISO_LOCAL_DATE);
    }

    /* JADX INFO: renamed from: c */
    public static xd3 m13803c(hw2 hw2Var, String str) {
        for (Map.Entry entry : hw2Var.m6523a().entrySet()) {
            if (entry.getValue() instanceof Set) {
                Iterator it = ((Set) entry.getValue()).iterator();
                while (it.hasNext()) {
                    if (str.equals((String) it.next())) {
                        return new xd3(((xd3) entry.getKey()).f34170a);
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized ArrayList m13804a() {
        try {
            ArrayList arrayList = new ArrayList();
            String strM13802b = m13802b(System.currentTimeMillis());
            e82 e82Var = this.f36410a;
            e82Var.getClass();
            wm0 wm0Var = null;
            for (Map.Entry entry : ((Map) y70.m13014O(r71.f29063a, new C0982og((Object) e82Var, wm0Var, (byte) 11))).entrySet()) {
                if (entry.getValue() instanceof Set) {
                    HashSet hashSet = new HashSet((Set) entry.getValue());
                    hashSet.remove(strM13802b);
                    if (hashSet.isEmpty()) {
                        continue;
                    } else {
                        String str = ((xd3) entry.getKey()).f34170a;
                        ArrayList arrayList2 = new ArrayList(hashSet);
                        C0664fu c0664fu = new C0664fu();
                        if (str == null) {
                            throw new NullPointerException("Null userAgent");
                        }
                        c0664fu.f19283a = str;
                        c0664fu.f19284b = arrayList2;
                        VarHandle.storeStoreFence();
                        arrayList.add(c0664fu);
                    }
                }
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            synchronized (this) {
                e82 e82Var2 = this.f36410a;
                byte b = 3;
                C0942nd c0942nd = new C0942nd(b);
                c0942nd.f25690b = jCurrentTimeMillis;
                VarHandle.storeStoreFence();
                e82Var2.getClass();
            }
            return arrayList;
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final synchronized void m13805d(String str, long j) {
        String strM13802b = m13802b(j);
        xd3 xd3Var = new xd3(str);
        e82 e82Var = this.f36410a;
        C0762ii c0762ii = new C0762ii((byte) 6);
        c0762ii.f21430b = this;
        c0762ii.f21431c = strM13802b;
        c0762ii.f21432d = str;
        c0762ii.f21433e = xd3Var;
        VarHandle.storeStoreFence();
        e82Var.getClass();
    }
}

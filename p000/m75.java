package p000;

import java.util.Comparator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class m75 implements Comparator {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ m75 f24720b = new m75(5);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f24721a;

    public /* synthetic */ m75(byte b) {
        this.f24721a = b;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f24721a) {
            case 0:
                return qs5.m10111p(obj != null ? obj.toString() : null, obj2 != null ? obj2.toString() : null);
            case 1:
                return String.valueOf(((Map.Entry) obj).getKey()).compareTo(String.valueOf(((Map.Entry) obj2).getKey()));
            case 2:
                return qs5.m10111p((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            case 3:
                return Integer.valueOf(((String) obj2).length()).compareTo(Integer.valueOf(((String) obj).length()));
            case 4:
                return qs5.m10111p((String) ((Map.Entry) obj).getKey(), (String) ((Map.Entry) obj2).getKey());
            default:
                return Long.compare(((Long) obj).longValue(), ((Long) obj2).longValue());
        }
    }
}

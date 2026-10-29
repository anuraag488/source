package p000;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: renamed from: zk */
/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public class C1408zk {

    /* JADX INFO: renamed from: d */
    public static final HashSet f36154d = new HashSet();

    /* JADX INFO: renamed from: a */
    public final String f36155a;

    /* JADX INFO: renamed from: b */
    public final String f36156b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ byte f36157c;

    public C1408zk(String str, String str2) {
        this.f36155a = str;
        this.f36156b = str2;
        f36154d.add(this);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo7351a() {
        HashSet hashSet = AbstractC1371yk.f35294a;
        String str = this.f36156b;
        if (hashSet.contains(str)) {
            return true;
        }
        String str2 = Build.TYPE;
        return ("eng".equals(str2) || "userdebug".equals(str2)) && hashSet.contains(str.concat(":dev"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1408zk(String str, String str2, byte b) {
        this(str, str2);
        this.f36157c = b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1408zk(String str) {
        this("IMPLEMENTATION_ONLY_FEATURE", str);
        this.f36157c = (byte) 3;
    }
}

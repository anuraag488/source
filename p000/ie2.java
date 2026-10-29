package p000;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class ie2 {

    /* JADX INFO: renamed from: a */
    public static final CopyOnWriteArrayList f21286a = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a */
    public static void m6772a(String str) {
        Iterator it = f21286a.iterator();
        if (!it.hasNext()) {
            throw new GeneralSecurityException(zi4.m13620t("No KMS client does support: ", str));
        }
        it.next().getClass();
        throw new ClassCastException();
    }
}

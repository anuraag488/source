package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class cn4 {

    /* JADX INFO: renamed from: a */
    public static final Logger f16161a = Logger.getLogger(cn4.class.getName());

    /* JADX INFO: renamed from: b */
    public static final AtomicBoolean f16162b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public static boolean m4052a() {
        return f16162b.get();
    }
}

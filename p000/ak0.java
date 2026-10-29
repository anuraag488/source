package p000;

import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ak0 {

    /* JADX INFO: renamed from: a */
    public HashSet f14577a;

    /* JADX INFO: renamed from: b */
    public Executor f14578b;

    /* JADX INFO: renamed from: c */
    public uj0 f14579c;

    /* JADX INFO: renamed from: d */
    public uj0 f14580d;

    static {
        Charset.forName("UTF-8");
        Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }
}

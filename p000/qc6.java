package p000;

import android.net.Uri;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class qc6 {

    /* JADX INFO: renamed from: a */
    public static final Uri f28388a = Uri.parse("content://com.google.android.gsf.gservices");

    /* JADX INFO: renamed from: b */
    public static final Pattern f28389b;

    /* JADX INFO: renamed from: c */
    public static final Pattern f28390c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f28389b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f28390c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}

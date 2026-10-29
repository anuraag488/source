package p000;

import android.net.Uri;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ze1 {

    /* JADX INFO: renamed from: a */
    public String f36013a;

    /* JADX INFO: renamed from: b */
    public HashMap f36014b;

    /* JADX INFO: renamed from: a */
    public final File m13541a(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int iIndexOf = encodedPath.indexOf(47, 1);
        if (iIndexOf == -1) {
            wb1.m12195o(uri, "Unable to find path from root: ");
            return null;
        }
        String strDecode = Uri.decode(encodedPath.substring(1, iIndexOf));
        String strDecode2 = Uri.decode(encodedPath.substring(iIndexOf + 1));
        File file = (File) this.f36014b.get(strDecode);
        if (file == null) {
            wb1.m12195o(uri, "Unable to find configured root for ");
            return null;
        }
        File file2 = new File(file, strDecode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (af1.m2962e(canonicalFile.getPath()).startsWith(af1.m2962e(file.getPath()).concat("/"))) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            wb1.m12195o(file2, "Failed to resolve canonical path for ");
            return null;
        }
    }
}

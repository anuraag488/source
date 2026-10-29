package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class y40 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f34845a;

    public /* synthetic */ y40(byte b) {
        this.f34845a = b;
    }

    /* JADX INFO: renamed from: a */
    public final Object m12818a(Object obj, b63 b63Var) throws PackageManager.NameNotFoundException {
        String str;
        String authority;
        switch (this.f34845a) {
            case 0:
                return ByteBuffer.wrap((byte[]) obj);
            case 1:
                Uri uri = (Uri) obj;
                if (AbstractC0707h.m6200c(uri)) {
                    return null;
                }
                String scheme = uri.getScheme();
                if (scheme != null && !scheme.equals("file")) {
                    return null;
                }
                String path = uri.getPath();
                str = path != null ? path : "";
                if (str.length() <= 0 || !y62.m12994x(str.charAt(0), '/', false) || ((String) hb0.m6301M0(uri.getPathSegments())) == null) {
                    return null;
                }
                if (!z62.m13387o(uri.getScheme(), "file")) {
                    return new File(uri.toString());
                }
                String path2 = uri.getPath();
                if (path2 != null) {
                    return new File(path2);
                }
                return null;
            case 2:
                return ((dz1) obj).f17525h;
            case 3:
                int iIntValue = ((Number) obj).intValue();
                Context context = b63Var.f15109a;
                try {
                    if (context.getResources().getResourceEntryName(iIntValue) == null) {
                        return null;
                    }
                    return Uri.parse("android.resource://" + context.getPackageName() + '/' + iIntValue);
                } catch (Resources.NotFoundException unused) {
                    return null;
                }
            case 4:
                Uri uri2 = (Uri) obj;
                if (!z62.m13387o(uri2.getScheme(), "android.resource") || (authority = uri2.getAuthority()) == null || hd4.m6345k0(authority) || uri2.getPathSegments().size() != 2) {
                    return null;
                }
                String authority2 = uri2.getAuthority();
                str = authority2 != null ? authority2 : "";
                Resources resourcesForApplication = b63Var.f15109a.getPackageManager().getResourcesForApplication(str);
                List<String> pathSegments = uri2.getPathSegments();
                int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), str);
                if (identifier == 0) {
                    xd2.m12669p(uri2, "Invalid android.resource URI: ");
                    return null;
                }
                return Uri.parse("android.resource://" + str + '/' + identifier);
            default:
                return Uri.parse((String) obj);
        }
    }
}

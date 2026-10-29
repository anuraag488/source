package p000;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public final class ve1 implements od2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ byte f32554a;

    public /* synthetic */ ve1(byte b) {
        this.f32554a = b;
    }

    @Override // p000.od2
    /* JADX INFO: renamed from: a */
    public final String mo5737a(Object obj, b63 b63Var) {
        switch (this.f32554a) {
            case 0:
                File file = (File) obj;
                return file.getPath() + ':' + file.lastModified();
            default:
                Uri uri = (Uri) obj;
                if (!z62.m13387o(uri.getScheme(), "android.resource")) {
                    return uri.toString();
                }
                StringBuilder sb = new StringBuilder();
                sb.append(uri);
                sb.append('-');
                Configuration configuration = b63Var.f15109a.getResources().getConfiguration();
                Bitmap.Config[] configArr = AbstractC0707h.f20231a;
                sb.append(configuration.uiMode & 48);
                return sb.toString();
        }
    }
}

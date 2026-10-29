package p000;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.VarHandle;
import java.util.HashMap;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class af1 extends ContentProvider {

    /* JADX INFO: renamed from: d */
    public static final String[] f14434d = {"_display_name", "_size"};

    /* JADX INFO: renamed from: e */
    public static final File f14435e = new File("/");

    /* JADX INFO: renamed from: f */
    public static final HashMap f14436f = new HashMap();

    /* JADX INFO: renamed from: a */
    public Object f14437a;

    /* JADX INFO: renamed from: b */
    public String f14438b;

    /* JADX INFO: renamed from: c */
    public ze1 f14439c;

    /* JADX INFO: renamed from: b */
    public static ze1 m2959b(Context context, String str) {
        ze1 ze1VarM2961d;
        HashMap map = f14436f;
        synchronized (map) {
            try {
                ze1VarM2961d = (ze1) map.get(str);
                if (ze1VarM2961d == null) {
                    try {
                        try {
                            ze1VarM2961d = m2961d(context, str);
                            map.put(str, ze1VarM2961d);
                        } catch (XmlPullParserException e) {
                            throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e);
                        }
                    } catch (IOException e2) {
                        throw new IllegalArgumentException("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", e2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ze1VarM2961d;
    }

    /* JADX INFO: renamed from: c */
    public static Uri m2960c(Context context, String str, File file) {
        ze1 ze1VarM2959b = m2959b(context, str);
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : ze1VarM2959b.f36014b.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (m2962e(canonicalPath).startsWith(m2962e(path).concat("/")) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry == null) {
                C1077qn.m9987m(zi4.m13620t("Failed to find configured root that contains ", canonicalPath));
                return null;
            }
            String path2 = ((File) entry.getValue()).getPath();
            return new Uri.Builder().scheme("content").authority(ze1VarM2959b.f36013a).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1), "/")).build();
        } catch (IOException unused) {
            wb1.m12195o(file, "Failed to resolve canonical path for ");
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ad  */
    /* JADX INFO: renamed from: d */
    public static ze1 m2961d(Context context, String str) throws XmlPullParserException, IOException {
        File externalStorageDirectory;
        ze1 ze1Var = new ze1();
        ze1Var.f36014b = new HashMap();
        ze1Var.f36013a = str;
        VarHandle.storeStoreFence();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(str, 128);
        if (providerInfoResolveContentProvider == null) {
            C1077qn.m9987m(zi4.m13620t("Couldn't find meta-data for provider with authority ", str));
            return null;
        }
        XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(context.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
        if (xmlResourceParserLoadXmlMetaData == null) {
            C1077qn.m9987m("Missing android.support.FILE_PROVIDER_PATHS meta-data");
            return null;
        }
        while (true) {
            int next = xmlResourceParserLoadXmlMetaData.next();
            if (next == 1) {
                return ze1Var;
            }
            if (next == 2) {
                String name = xmlResourceParserLoadXmlMetaData.getName();
                String attributeValue = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name");
                String attributeValue2 = xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "path");
                if ("root-path".equals(name)) {
                    externalStorageDirectory = f14435e;
                } else if ("files-path".equals(name)) {
                    externalStorageDirectory = context.getFilesDir();
                } else if ("cache-path".equals(name)) {
                    externalStorageDirectory = context.getCacheDir();
                } else if ("external-path".equals(name)) {
                    externalStorageDirectory = Environment.getExternalStorageDirectory();
                } else if ("external-files-path".equals(name)) {
                    File[] externalFilesDirs = context.getExternalFilesDirs(null);
                    if (externalFilesDirs.length > 0) {
                        externalStorageDirectory = externalFilesDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-cache-path".equals(name)) {
                    File[] externalCacheDirs = context.getExternalCacheDirs();
                    if (externalCacheDirs.length > 0) {
                        externalStorageDirectory = externalCacheDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else if ("external-media-path".equals(name)) {
                    File[] externalMediaDirs = context.getExternalMediaDirs();
                    if (externalMediaDirs.length > 0) {
                        externalStorageDirectory = externalMediaDirs[0];
                    } else {
                        externalStorageDirectory = null;
                    }
                } else {
                    externalStorageDirectory = null;
                }
                if (externalStorageDirectory == null) {
                    continue;
                } else {
                    String str2 = new String[]{attributeValue2}[0];
                    if (str2 != null) {
                        externalStorageDirectory = new File(externalStorageDirectory, str2);
                    }
                    if (TextUtils.isEmpty(attributeValue)) {
                        C1077qn.m9987m("Name must not be empty");
                        return null;
                    }
                    try {
                        ze1Var.f36014b.put(attributeValue, externalStorageDirectory.getCanonicalFile());
                    } catch (IOException e) {
                        throw new IllegalArgumentException("Failed to resolve canonical path for " + externalStorageDirectory, e);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m2962e(String str) {
        return (str.length() <= 0 || str.charAt(str.length() + (-1)) != '/') ? str : str.substring(0, str.length() - 1);
    }

    /* JADX INFO: renamed from: a */
    public final ze1 m2963a() {
        ze1 ze1VarM2959b;
        synchronized (this.f14437a) {
            try {
                if (this.f14438b == null) {
                    throw new NullPointerException("mAuthority is null. Did you override attachInfo and did not call super.attachInfo()?");
                }
                ze1VarM2959b = this.f14439c;
                if (ze1VarM2959b == null) {
                    ze1VarM2959b = m2959b(getContext(), this.f14438b);
                    this.f14439c = ze1VarM2959b;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return ze1VarM2959b;
    }

    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        super.attachInfo(context, providerInfo);
        if (providerInfo.exported) {
            throw new SecurityException("Provider must not be exported");
        }
        if (!providerInfo.grantUriPermissions) {
            throw new SecurityException("Provider must grant uri permissions");
        }
        String str = providerInfo.authority;
        if (str == null || str.trim().isEmpty()) {
            throw new SecurityException("Provider must have a non-empty authority");
        }
        String str2 = providerInfo.authority.split(";")[0];
        synchronized (this.f14437a) {
            this.f14438b = str2;
        }
        HashMap map = f14436f;
        synchronized (map) {
            map.remove(str2);
        }
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri uri, String str, String[] strArr) {
        return m2963a().m13541a(uri).delete() ? 1 : 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        File fileM13541a = m2963a().m13541a(uri);
        int iLastIndexOf = fileM13541a.getName().lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return "application/octet-stream";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileM13541a.getName().substring(iLastIndexOf + 1));
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final String getTypeAnonymous(Uri uri) {
        return "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri uri, ContentValues contentValues) {
        throw new UnsupportedOperationException("No external inserts");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public final ParcelFileDescriptor openFile(Uri uri, String str) {
        int i;
        File fileM13541a = m2963a().m13541a(uri);
        if ("r".equals(str)) {
            i = 268435456;
        } else if ("w".equals(str) || "wt".equals(str)) {
            i = 738197504;
        } else if ("wa".equals(str)) {
            i = 704643072;
        } else if ("rw".equals(str)) {
            i = 939524096;
        } else {
            if (!"rwt".equals(str)) {
                C1077qn.m9987m(zi4.m13620t("Invalid mode: ", str));
                return null;
            }
            i = 1006632960;
        }
        return ParcelFileDescriptor.open(fileM13541a, i);
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i;
        File fileM13541a = m2963a().m13541a(uri);
        String queryParameter = uri.getQueryParameter("displayName");
        if (strArr == null) {
            strArr = f14434d;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int i2 = 0;
        for (String str3 : strArr) {
            if ("_display_name".equals(str3)) {
                strArr3[i2] = "_display_name";
                i = i2 + 1;
                objArr[i2] = queryParameter == null ? fileM13541a.getName() : queryParameter;
            } else {
                if ("_size".equals(str3)) {
                    strArr3[i2] = "_size";
                    i = i2 + 1;
                    objArr[i2] = Long.valueOf(fileM13541a.length());
                }
            }
            i2 = i;
        }
        String[] strArr4 = new String[i2];
        System.arraycopy(strArr3, 0, strArr4, 0, i2);
        Object[] objArr2 = new Object[i2];
        System.arraycopy(objArr, 0, objArr2, 0, i2);
        MatrixCursor matrixCursor = new MatrixCursor(strArr4, 1);
        matrixCursor.addRow(objArr2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
}

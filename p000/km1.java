package p000;

import android.content.ContentProviderClient;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.RemoteException;
import android.os.Trace;
import android.util.Log;
import java.lang.invoke.VarHandle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
public abstract class km1 {

    /* JADX INFO: renamed from: a */
    public static final bp2 f23232a = new bp2(2);

    /* JADX INFO: renamed from: b */
    public static final C1254vf f23233b = new C1254vf(4);

    /* JADX WARN: Code duplicated, block: B:16:0x003a  */
    /* JADX INFO: renamed from: a */
    public static li0 m7558a(Context context, List list) {
        Typeface typefaceCreate;
        Trace.beginSection("FontProvider.getFontFamilyResult");
        try {
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                byte b = 1;
                if (i >= list.size()) {
                    li0 li0Var = new li0(b);
                    li0Var.f24043b = false;
                    li0Var.f24044c = arrayList;
                    VarHandle.storeStoreFence();
                    return li0Var;
                }
                lm1 lm1Var = (lm1) list.get(i);
                String str = lm1Var.f24156e;
                i50 i50Var = ds4.f17333a;
                if (str == null || str.isEmpty()) {
                    typefaceCreate = null;
                } else {
                    typefaceCreate = Typeface.create(str, 0);
                    Typeface typefaceCreate2 = Typeface.create(Typeface.DEFAULT, 0);
                    if (typefaceCreate == null || typefaceCreate.equals(typefaceCreate2)) {
                        typefaceCreate = null;
                    }
                }
                if (typefaceCreate == null || ds4.m4676b(typefaceCreate) == null) {
                    ProviderInfo providerInfoM7559b = m7559b(context.getPackageManager(), lm1Var, context.getResources());
                    if (providerInfoM7559b == null) {
                        li0 li0Var2 = new li0(b);
                        li0Var2.f24043b = true;
                        li0Var2.f24044c = Collections.singletonList(null);
                        VarHandle.storeStoreFence();
                        return li0Var2;
                    }
                    arrayList.add(m7560c(context, lm1Var, providerInfoM7559b.authority));
                } else {
                    String str2 = lm1Var.f24157f;
                    zm1 zm1Var = new zm1();
                    zm1Var.f36176a = new Uri.Builder().scheme("systemfont").authority(str).build();
                    zm1Var.f36177b = 0;
                    zm1Var.f36178c = 400;
                    zm1Var.f36179d = false;
                    zm1Var.f36180e = str2;
                    zm1Var.f36181f = 0;
                    arrayList.add(new zm1[]{zm1Var});
                }
                i++;
            }
        } finally {
            Trace.endSection();
        }
    }

    /* JADX INFO: renamed from: b */
    public static ProviderInfo m7559b(PackageManager packageManager, lm1 lm1Var, Resources resources) {
        C1254vf c1254vf = f23233b;
        bp2 bp2Var = f23232a;
        Trace.beginSection("FontProvider.getProvider");
        try {
            List listM10648T = lm1Var.f24155d;
            String str = lm1Var.f24152a;
            String str2 = lm1Var.f24153b;
            if (listM10648T == null) {
                listM10648T = sc6.m10648T(resources, 0);
            }
            jm1 jm1Var = new jm1();
            jm1Var.f22419a = str;
            jm1Var.f22420b = str2;
            jm1Var.f22421c = listM10648T;
            ProviderInfo providerInfo = (ProviderInfo) bp2Var.m3648c(jm1Var);
            if (providerInfo != null) {
                Trace.endSection();
                return providerInfo;
            }
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(str, 0);
            if (providerInfoResolveContentProvider == null) {
                throw new PackageManager.NameNotFoundException("No package found for authority: " + str);
            }
            if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                throw new PackageManager.NameNotFoundException("Found content provider " + str + ", but package was not " + str2);
            }
            Signature[] signatureArr = packageManager.getPackageInfo(providerInfoResolveContentProvider.packageName, 64).signatures;
            ArrayList arrayList = new ArrayList();
            for (Signature signature : signatureArr) {
                arrayList.add(signature.toByteArray());
            }
            Collections.sort(arrayList, c1254vf);
            for (int i = 0; i < listM10648T.size(); i++) {
                ArrayList arrayList2 = new ArrayList((Collection) listM10648T.get(i));
                Collections.sort(arrayList2, c1254vf);
                if (arrayList.size() == arrayList2.size()) {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            bp2Var.m3649d(jm1Var, providerInfoResolveContentProvider);
                            Trace.endSection();
                            return providerInfoResolveContentProvider;
                        }
                        if (!Arrays.equals((byte[]) arrayList.get(i2), (byte[]) arrayList2.get(i2))) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            Trace.endSection();
            return null;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static zm1[] m7560c(Context context, lm1 lm1Var, String str) {
        Uri uri;
        boolean z;
        String str2 = lm1Var.f24157f;
        Trace.beginSection("FontProvider.query");
        try {
            ArrayList arrayList = new ArrayList();
            Uri uriBuild = new Uri.Builder().scheme("content").authority(str).build();
            Uri uriBuild2 = new Uri.Builder().scheme("content").authority(str).appendPath("file").build();
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = context.getContentResolver().acquireUnstableContentProviderClient(uriBuild);
            Cursor cursorQuery = null;
            try {
                String[] strArr = {"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                Trace.beginSection("ContentQueryWrapper.query");
                try {
                    String str3 = lm1Var.f24154c;
                    String[] strArr2 = (str2 == null || str2.isBlank()) ? new String[]{str3} : new String[]{str3, "VF"};
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        try {
                            cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriBuild, strArr, "query = ?", strArr2, null, null);
                        } catch (RemoteException e) {
                            Log.w("FontsProvider", "Unable to query the content provider", e);
                        }
                    }
                    Trace.endSection();
                    if (cursorQuery != null && cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex("result_code");
                        ArrayList arrayList2 = new ArrayList();
                        int columnIndex2 = cursorQuery.getColumnIndex("_id");
                        int columnIndex3 = cursorQuery.getColumnIndex("file_id");
                        int columnIndex4 = cursorQuery.getColumnIndex("font_ttc_index");
                        int columnIndex5 = cursorQuery.getColumnIndex("font_weight");
                        int columnIndex6 = cursorQuery.getColumnIndex("font_italic");
                        while (cursorQuery.moveToNext()) {
                            int i = columnIndex != -1 ? cursorQuery.getInt(columnIndex) : 0;
                            int i2 = columnIndex4 != -1 ? cursorQuery.getInt(columnIndex4) : 0;
                            Uri uriWithAppendedId = columnIndex3 == -1 ? ContentUris.withAppendedId(uriBuild, cursorQuery.getLong(columnIndex2)) : ContentUris.withAppendedId(uriBuild2, cursorQuery.getLong(columnIndex3));
                            int i3 = columnIndex5 != -1 ? cursorQuery.getInt(columnIndex5) : 400;
                            if (columnIndex6 != -1) {
                                uri = uriBuild2;
                                z = true;
                                if (cursorQuery.getInt(columnIndex6) == 1) {
                                }
                                zm1 zm1Var = new zm1();
                                uriWithAppendedId.getClass();
                                zm1Var.f36176a = uriWithAppendedId;
                                zm1Var.f36177b = i2;
                                zm1Var.f36178c = i3;
                                zm1Var.f36179d = z;
                                zm1Var.f36180e = str2;
                                zm1Var.f36181f = i;
                                VarHandle.storeStoreFence();
                                arrayList2.add(zm1Var);
                                uriBuild2 = uri;
                            } else {
                                uri = uriBuild2;
                            }
                            z = false;
                            zm1 zm1Var2 = new zm1();
                            uriWithAppendedId.getClass();
                            zm1Var2.f36176a = uriWithAppendedId;
                            zm1Var2.f36177b = i2;
                            zm1Var2.f36178c = i3;
                            zm1Var2.f36179d = z;
                            zm1Var2.f36180e = str2;
                            zm1Var2.f36181f = i;
                            VarHandle.storeStoreFence();
                            arrayList2.add(zm1Var2);
                            uriBuild2 = uri;
                        }
                        arrayList = arrayList2;
                    }
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    zm1[] zm1VarArr = (zm1[]) arrayList.toArray(new zm1[0]);
                    Trace.endSection();
                    return zm1VarArr;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } catch (Throwable th2) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                    contentProviderClientAcquireUnstableContentProviderClient.close();
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }
}

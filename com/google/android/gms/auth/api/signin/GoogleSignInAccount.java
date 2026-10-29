package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC0894m2;
import p000.C1280w4;
import p000.oh6;
import p000.y42;

/* JADX INFO: compiled from: r8-map-id-c7a6dd88a2b5a3bd0987de47dc6d7e9548d0e3d2a056e45227e1b1f5524e3cde */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends AbstractC0894m2 implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new C1280w4((byte) 20);

    /* JADX INFO: renamed from: d */
    public final int f16211d;

    /* JADX INFO: renamed from: e */
    public final String f16212e;

    /* JADX INFO: renamed from: f */
    public final String f16213f;

    /* JADX INFO: renamed from: g */
    public final String f16214g;

    /* JADX INFO: renamed from: h */
    public final String f16215h;

    /* JADX INFO: renamed from: i */
    public final Uri f16216i;

    /* JADX INFO: renamed from: j */
    public String f16217j;

    /* JADX INFO: renamed from: k */
    public final long f16218k;

    /* JADX INFO: renamed from: l */
    public final String f16219l;

    /* JADX INFO: renamed from: m */
    public final List f16220m;

    /* JADX INFO: renamed from: n */
    public final String f16221n;

    /* JADX INFO: renamed from: o */
    public final String f16222o;

    /* JADX INFO: renamed from: p */
    public final HashSet f16223p = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, ArrayList arrayList, String str7, String str8) {
        this.f16211d = i;
        this.f16212e = str;
        this.f16213f = str2;
        this.f16214g = str3;
        this.f16215h = str4;
        this.f16216i = uri;
        this.f16217j = str5;
        this.f16218k = j;
        this.f16219l = str6;
        this.f16220m = arrayList;
        this.f16221n = str7;
        this.f16222o = str8;
    }

    /* JADX INFO: renamed from: a */
    public static GoogleSignInAccount m4060a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(1, jSONArray.getString(i)));
        }
        String strOptString2 = jSONObject.optString("id");
        String strOptString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
        String strOptString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
        String strOptString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
        String strOptString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
        String strOptString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
        String string = jSONObject.getString("obfuscatedIdentifier");
        y42.m12851X(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, strOptString2, strOptString3, strOptString4, strOptString5, uri, null, j, string, new ArrayList(hashSet), strOptString6, strOptString7);
        googleSignInAccount.f16217j = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        if (!googleSignInAccount.f16219l.equals(this.f16219l)) {
            return false;
        }
        HashSet hashSet = new HashSet(googleSignInAccount.f16220m);
        hashSet.addAll(googleSignInAccount.f16223p);
        HashSet hashSet2 = new HashSet(this.f16220m);
        hashSet2.addAll(this.f16223p);
        return hashSet.equals(hashSet2);
    }

    public final int hashCode() {
        int iHashCode = this.f16219l.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f16220m);
        hashSet.addAll(this.f16223p);
        return (iHashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM9092Q = oh6.m9092Q(parcel, 20293);
        oh6.m9091P(parcel, 1, 4);
        parcel.writeInt(this.f16211d);
        oh6.m9088M(parcel, 2, this.f16212e);
        oh6.m9088M(parcel, 3, this.f16213f);
        oh6.m9088M(parcel, 4, this.f16214g);
        oh6.m9088M(parcel, 5, this.f16215h);
        oh6.m9087L(parcel, 6, this.f16216i, i);
        oh6.m9088M(parcel, 7, this.f16217j);
        oh6.m9091P(parcel, 8, 8);
        parcel.writeLong(this.f16218k);
        oh6.m9088M(parcel, 9, this.f16219l);
        oh6.m9090O(parcel, 10, this.f16220m);
        oh6.m9088M(parcel, 11, this.f16221n);
        oh6.m9088M(parcel, 12, this.f16222o);
        oh6.m9094S(parcel, iM9092Q);
    }
}

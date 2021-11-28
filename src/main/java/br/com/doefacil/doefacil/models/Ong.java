package br.com.doefacil.doefacil.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
@Document
public class Ong {

    @Id
    String _id;
    String address;
    String email;
    String phone_number;
    Binary image;
    String description;
    String site;
    String pix;
    String bank_name;
    String bank_agency;
    String bank_account;

}

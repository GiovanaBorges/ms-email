package com.msmail.msmail.repositories;

import com.msmail.msmail.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<EmailModel,Long> {

}
